import chapterEight.classWork.GeoPoliticalZones;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        GeoPoliticalZones southEast = GeoPoliticalZones.SOUTH_EAST;
        southEast.name();
        System.out.println(Arrays.toString(GeoPoliticalZones.values()));
        List<Integer> nums = new ArrayList<>();
        nums.add(20);
        nums.add(15);
        nums.add(21);
        nums.add(2);
        nums.add(19);
        nums.add(27);
        nums.add(24);
        nums.add(26);
        nums.add(4);
        nums.add(11);
        nums.add(25);
        nums.add(29);
        nums.add(16);
        nums.add(5);
        nums.add(3);
//        for (int i = 1; i <= 29; i++) {
//            if (!nums.contains(i))System.out.print(i+" ");
//        }
        String word = "I love you";
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