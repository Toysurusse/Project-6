import control.Cryptor;
import dao.DaoFactory;
import dao.list.TopoDAO;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.swing.*;

public class main {

    public static void main (String [] args) throws Exception {
        Cryptor test =new Cryptor ();

        byte [] set = test.encrypt("mot de l'altère");
        System.out.println(set);
        String decript = test.decrypt(set);
        System.out.println(decript);

    }

}
