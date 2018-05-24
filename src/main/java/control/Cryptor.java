package control;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.swing.JOptionPane;

/**
 * This program demonstrates how to encrypt/decrypt input
 * using the Blowfish Cipher with the Java Cryptograhpy.
 *
 */
public class Cryptor {



    public byte[] encrypt (String input)throws Exception {
        // create a key generator based upon the Blowfish cipher
        KeyGenerator keygenerator = KeyGenerator.getInstance("Blowfish");
        // create a key
        SecretKey secretkey = keygenerator.generateKey();
        // create a cipher based upon Blowfish
        Cipher cipher = Cipher.getInstance("Blowfish");
        // initialise cipher to with secret key
        cipher.init(Cipher.ENCRYPT_MODE, secretkey);
        // get the text to encrypt
        System.out.println(input);
        // encrypt message
        byte[] encrypted = cipher.doFinal(input.getBytes());
    return encrypted;
    }

    public String decrypt (byte[] input)throws Exception {
        // create a key generator based upon the Blowfish cipher
        KeyGenerator keygenerator = KeyGenerator.getInstance("Blowfish");
        // create a key
        SecretKey secretkey = keygenerator.generateKey();
        // create a cipher based upon Blowfish
        Cipher cipher = Cipher.getInstance("Blowfish");

        cipher.init(Cipher.DECRYPT_MODE, secretkey);
        // decrypt message
        byte[] decrypted = cipher.doFinal(input);
        System.out.println(decrypted);

        String output = new String( decrypted , "Cp1252" );
        System.out.println(new String( decrypted , "Cp1252" ));
        return output;
    }

    public static void main(String[] args) throws Exception {

    Cryptor test =new Cryptor ();

    byte [] set = test.encrypt("mot de l'altère");
        System.out.println(set);
    String decript = test.decrypt(set);
        System.out.println(decript);
    }
}