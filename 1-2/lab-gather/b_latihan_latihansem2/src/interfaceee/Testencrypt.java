package interfaceee;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

interface Encryptable{
	String encrypt(String data);
	String decrypt(String encrypteddata);
}

class AES implements Encryptable{
	
	 // Define the AES algorithm as a constant
    private static final String AES_ALGORITHM = "AES";

    // Declare a SecretKey to store the encryption key
    private SecretKey secretKey;

    // Constructor to initialize the encryption key
    public AES() {
        try {
            KeyGenerator keyGen = KeyGenerator.getInstance(AES_ALGORITHM);
            keyGen.init(128);
            secretKey = keyGen.generateKey();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

	@Override
	public String encrypt(String data) {
		// TODO Auto-generated method stub
		 try {
	            Cipher cipher = Cipher.getInstance(AES_ALGORITHM);
	            cipher.init(Cipher.ENCRYPT_MODE, secretKey);

	            byte[] encryptedBytes = cipher.doFinal(data.getBytes());
	            return Base64.getEncoder().encodeToString(encryptedBytes);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return null;
	}

	@Override
	public String decrypt(String encrypteddata) {
		// TODO Auto-generated method stub
		 try {
	            byte[] encryptedBytes = Base64.getDecoder().decode(encrypteddata);

	            Cipher cipher = Cipher.getInstance(AES_ALGORITHM);
	            cipher.init(Cipher.DECRYPT_MODE, secretKey);

	            byte[] decryptedBytes = cipher.doFinal(encryptedBytes);
	            return new String(decryptedBytes);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return null;
	}
	
}

class RSA implements Encryptable{
	
	 // Define the RSA algorithm as a constant
    private static final String RSA_ALGORITHM = "RSA";

    // Declare a KeyPair to store the public and private keys
    private KeyPair keyPair;

    // Constructor to generate a KeyPair for encryption and decryption
    public RSA() {
        try {
            KeyPairGenerator keyGen = KeyPairGenerator.getInstance(RSA_ALGORITHM);
            keyGen.initialize(2048);
            keyPair = keyGen.generateKeyPair();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

	@Override
	public String encrypt(String data) {
		// TODO Auto-generated method stub
		try {
            // Get the public key from the KeyPair
            PublicKey publicKey = keyPair.getPublic();
            Cipher cipher = Cipher.getInstance(RSA_ALGORITHM);
            cipher.init(Cipher.ENCRYPT_MODE, publicKey);

            byte[] encryptedBytes = cipher.doFinal(data.getBytes());
            return Base64.getEncoder().encodeToString(encryptedBytes);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
	}

	@Override
	public String decrypt(String encrypteddata) {
		// TODO Auto-generated method stub
		 try {
	            // Get the private key from the KeyPair
	            PrivateKey privateKey = keyPair.getPrivate();
	            byte[] encryptedBytes = Base64.getDecoder().decode(encrypteddata);

	            Cipher cipher = Cipher.getInstance(RSA_ALGORITHM);
	            cipher.init(Cipher.DECRYPT_MODE, privateKey);

	            byte[] decryptedBytes = cipher.doFinal(encryptedBytes);
	            return new String(decryptedBytes);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return null;
	}
	
}

public class Testencrypt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 // Create an instance of the AES class for encryption and decryption
        Encryptable aes = new AES();
        
        // Encrypt data using AES encryption and store the result
        String encryptedDataAES = aes.encrypt("Java Interface.");
        System.out.println("AES Encrypted: " + encryptedDataAES);
        
        // Decrypt the AES-encrypted data and store the result
        String decryptedDataAES = aes.decrypt(encryptedDataAES);
        System.out.println("AES Decrypted: " + decryptedDataAES);

        // Create an instance of the RSA class for encryption and decryption
        Encryptable rsa = new RSA();
        
        // Encrypt data using RSA encryption and store the result
        String encryptedDataRSA = rsa.encrypt("Java Interface.");
        System.out.println("RSA Encrypted: " + encryptedDataRSA);
        
        // Decrypt the RSA-encrypted data and store the result
        String decryptedDataRSA = rsa.decrypt(encryptedDataRSA);
        System.out.println("RSA Decrypted: " + decryptedDataRSA);

	}

}
