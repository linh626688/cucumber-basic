package com.basic;

import java.util.Arrays;

public class Main {
    static int birthdayCakeCandles(int[] ar) {
        int count = 0;
        Arrays.sort(ar);
        int maxHeight = ar[(ar.length) - 1];
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == maxHeight) {
                count++;
            }
        }

        return count;
    }

    static int pageCount(int n, int p) {
        int count = 0;
        int half = n / 2;

        if ((n - p) / 2 > (p - 1) / 2) {
            count = (p - 1) / 2;
        } else {
            if (n - p > 1) {
                count = (n - p) / 2;
            }
//            count
        }

        return count;

    }

    static int getMoneySpent(int[] keyboards, int[] drives, int budget) {
        int max = -1;

        for (int i = 0; i < keyboards.length; i++) {
            for (int j = 0; j < drives.length; j++) {
                if (keyboards[i] + drives[j] <= budget && keyboards[i] + drives[j] > max)
                    max = keyboards[i] + drives[j];
            }
        }
        return max;
    }

    static String catAndMouse(int x, int y, int z) {

        int rangeA = Math.abs(z - x);
        int rangeB = Math.abs(z - y);
        if (rangeA > rangeB) {
            return "Cat B";
        } else if (rangeA < rangeB) {
            return "Cat A";
        } else return "Mouse C";
    }

    static int saveThePrisoner(int n, int m, int s) {
        int boi = m % n;
        int result = 0;
        if (boi > 0) {
            result = (m - boi * n) + s;
            if (result > n) {
                result = Math.abs(result - n);
            }
        } else {
            result = (s + m) < n ? s + m : (s + m) - n;
        }
        System.out.println(result);
        return 0;
    }


    public static void main(String[] args) {
        saveThePrisoner(5, 2, 1);
    }
}
