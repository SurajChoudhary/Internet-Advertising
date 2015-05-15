/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package System.UserAccount;
    
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import org.apache.commons.codec.binary.Base64;

/**
 *
 * @author SURAJ
 */
public class HashUtil {

    public enum HashingTechqniue {

        SSHA256("SHA-256"), MD5("MD5");
        private String value;

        private HashingTechqniue(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public byte[] stringToByte(String input) {

        if (input == null || input.isEmpty()) {
            return null;
        }
        if (Base64.isBase64(input)) {
            return Base64.decodeBase64(input);

        } else {
            return Base64.encodeBase64(input.getBytes());
        }
    }

    public String bytetoBase64String(byte[] input) {
        if (input == null) {
            return null;
        }
        return Base64.encodeBase64String(input);
    }

    public byte[] generateSalt() {
        SecureRandom random = new SecureRandom();
        byte bytes[] = new byte[20];
        random.nextBytes(bytes);
        return bytes;
    }

    public byte[] getHashWithSalt(String input, HashingTechqniue technique, byte[] salt) {

        if (input == null || input.isEmpty() || technique == null || salt == null) {
            return null;
        }

        MessageDigest digest;
        try {
            digest = MessageDigest.getInstance(technique.value);
        } catch (NoSuchAlgorithmException e) {
            return null;
        }
        digest.reset();
        digest.update(salt);
        byte[] hashedBytes = digest.digest(stringToByte(input));
        return hashedBytes;
    }
}