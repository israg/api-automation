package util;

import java.util.Random;

public class Common {

    public static String generateString(int s) {
        String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        Random random = new Random();
        String text = "";
        for (int i = 0; i < s; i++) {
            text += AB.charAt(random.nextInt(AB.length()));
        }
        return text;
    }

    public static String generateNumericString(int s) {
        Random random = new Random();
        String text = "";
        for (int i = 0; i < s; i++)
            text += random.nextInt(9);
        return text;

    }

    public static String generateNumericStringWithRange(int digitCount, int startValue, int endValue) {
        Random random = new Random();
        String text = "";
        for (int i = 0; i < digitCount; i++)
            text += random.nextInt((endValue - startValue) + 1) + startValue;
        return text;

    }
}
