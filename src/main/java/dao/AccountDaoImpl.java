package dao;

import beans.Account;
import beans.Commentaire;
import dao.list.AccountDAO;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AccountDaoImpl implements AccountDAO {

    public AccountDaoImpl(DaoFactory daoFactory){
        this.daoFactory =daoFactory;
    }

    private DaoFactory daoFactory;

    @Override
    public void add(Account account) {
        Connection connexion = null;
        PreparedStatement preparedStatement = null;
        try {
            connexion = daoFactory.getConnection();
            preparedStatement = connexion.prepareStatement("INSERT INTO public.compte(id, nom, prenom, pseudo, mot_de_passe, sexe, adresse_id)VALUES (?, ?, ?, ?, ?, ?, ?);");
            preparedStatement.setInt(1, account.getId());
            preparedStatement.setString(2, account.getName());
            preparedStatement.setString(3, account.getFirstName());
            preparedStatement.setString(4, account.getPseudo());
            preparedStatement.setString(5, account.getPassword());
            preparedStatement.setString(6, account.getSex());
            preparedStatement.setInt(7, account.getAdresseId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public int lastIDCom (List <Account> acc){
        int size =acc.size();
        System.out.println(size);
        return size;}

    public Account control(String pseudo, String password,List <Account> accountDAO) {
        Account account = null ;
        for (int i = 0; i < accountDAO.size(); i++) {
            if (pseudo.equals(accountDAO.get(i).getPseudo()) && password.equals(accountDAO.get(i).getPassword())) {
                account = accountDAO.get(i);
            }
        }
        return account;
    }


    @Override
    public List<Account> read() {
        List<Account> accounts = new ArrayList<Account>();
        Statement statement =null ;
        ResultSet resultat =null ;
        Connection connexion =null;

        try {

            connexion =daoFactory.getConnection();
            statement=connexion.createStatement();
            resultat = statement.executeQuery("SELECT * FROM public.compte order by id");

            while (resultat.next()) {

                int id = resultat.getInt(1);
                String name = resultat.getString(2);
                String firstName = resultat.getString(3);
                String pseudo = resultat.getString(4);
                String password = resultat.getString(5);
                String sex = resultat.getString(6);
                int adresseId = resultat.getInt(7);

                Account account = new Account();
                account.setId(id);
                account.setName(name);
                account.setFirstName(firstName);
                account.setPseudo(pseudo);
                account.setPassword(password);
                account.setSex(sex);
                account.setAdresseId(adresseId);

                accounts.add(account);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return accounts;
    }
}