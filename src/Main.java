import com.fasterxml.jackson.databind.util.JSONPObject;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        System.out.println(encrypt("moyinoluwa"));
        System.out.println(decode("21e5c522ae6611e2a1826833c8d7ec6547d4cf23a2d59fd94687dbb7060bd86"));
    }

    private static String decode(String input) {
        return null;
    }

    public static String hashString(String input) throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] hash = digest.digest(input.getBytes(StandardCharsets.UTF_8));
        System.out.println(Arrays.toString(hash));
        StringBuilder hexString = new StringBuilder();
        for (byte b : hash) {
            String hex = Integer.toHexString(0xff & b);
            if (hex.length() == 1) hexString.append('0');
            hexString.append(hex);
        }
        return hexString.toString();
    }

    public static String hashString2(String input) throws NoSuchAlgorithmException {
        String password = "myPassword";
        int hash = Objects.hashCode(password);
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] hash2 = digest.digest(input.getBytes());
        StringBuilder hexString = new StringBuilder();
        for (byte b : hash2) {
            String hex = Integer.toHexString(0xff & b);
//            if (b.length() == 1) hexString.append('0');
            hexString.append(hex);
        }
//        return hexString.toString();
        return "Hash value of the password is: " + hexString.toString();
    }

    private static String encrypt(String input) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = messageDigest.digest(input.getBytes(StandardCharsets.UTF_8));
        StringBuilder encryptedInput = new StringBuilder();
        for (byte each : bytes) {
            String hex = Integer.toHexString(0xff & each);
            encryptedInput.append(hex);
        }
        return encryptedInput.toString();
    }

}