package dao;

import entity.Account;
import dao.beans.AccountDao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AccountDaoImpl implements AccountDao {

    public AccountDaoImpl(DaoFactory daoFactory){
        this.daoFactory =daoFactory;
    }

    private DaoFactory daoFactory;

    public AccountDaoImpl() {
    }

    @Override
    public void add(Account account) {
        insert(account,"INSERT INTO public.compte(id, nom, prenom, pseudo, mot_de_passe, sexe, adresse_id, accessuser)VALUES (?, ?, ?, ?, ?, ?, ?, ?);");
    }

    @Override
    public void update(Account account) {
        insert(account,"UPDATE public.compte\n" +
                "\tSET id=?, nom=?, prenom=?, pseudo=?, mot_de_passe=?, sexe=?, adresse_id=?, accessuser=?\n" +
                "\tWHERE id = "+account.getId()+";");
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

    public boolean controlUnique(String pseudo, List<Account> accountDAO){
        boolean test=false;
        for (Account anAccountDAO : accountDAO) {
            if (pseudo.equals(anAccountDAO.getPseudo())) {
                test = true;
            }
        }
        return test;
    }

    @Override
    public Account findAccount (int id) {
        List<Account> accounts = new ArrayList<Account>();
        accounts = extract("SELECT * FROM public.compte WHERE id ="+id+" order by id");
        Account account = accounts.get(0);
        return account;
    }

    @Override
    public List<Account> read() {
        List<Account> accounts = new ArrayList<Account>();
        accounts = extract("SELECT * FROM public.compte order by id");
        return accounts;
    }

    public void insert (Account account, String request){
        Connection connexion = null;
        PreparedStatement preparedStatement = null;
        try {
            connexion = daoFactory.getInstance();
            preparedStatement = connexion.prepareStatement(request);
            preparedStatement.setInt(1, account.getId());
            preparedStatement.setString(2, account.getName());
            preparedStatement.setString(3, account.getFirstName());
            preparedStatement.setString(4, account.getPseudo());
            preparedStatement.setString(5, account.getPassword());
            preparedStatement.setString(6, account.getSex());
            preparedStatement.setInt(7, account.getAdressId());
            preparedStatement.setInt(8, account.getAccessLevel());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


    public List<Account> extract(String request) {
        List<Account> accounts = new ArrayList<Account>();
        Statement statement ;
        ResultSet resultat ;

        try {
            statement = daoFactory.getStatement();
            resultat = statement.executeQuery(request);

            while (resultat.next()) {

                int id = resultat.getInt(1);
                String name = resultat.getString(2);
                String firstName = resultat.getString(3);
                String pseudo = resultat.getString(4);
                String password = resultat.getString(5);
                String sex = resultat.getString(6);
                int adresseId = resultat.getInt(7);
                int accessUser = resultat.getInt(8);

                Account account = new Account();
                account.setId(id);
                account.setName(name);
                account.setFirstName(firstName);
                account.setPseudo(pseudo);
                account.setPassword(password);
                account.setSex(sex);
                account.setAdressId(adresseId);
                account.setAccessLevel(accessUser);

                accounts.add(account);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return accounts;
    }
}