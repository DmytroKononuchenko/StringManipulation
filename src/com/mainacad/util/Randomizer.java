package com.mainacad.util;

import java.util.Random;

public class Randomizer {

    public static int getRandomNymber(int min, int max) {

        int randomNumber = min + new Random().nextInt(max - min);
        return randomNumber;
    }

    public static String getRandomString(int length) {
        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890";

        char[] symbols = alphabet.toCharArray();

        String outText = "";

        for (int i = 0; i < length; i++) {
            outText += symbols[getRandomNymber(0, symbols.length - 1)];
        }
        return outText;

    }
}
