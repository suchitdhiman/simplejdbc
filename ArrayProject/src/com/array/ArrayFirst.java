package com.array;

import java.util.Scanner;

public class ArrayFirst {

    private static void reverse(int[] arr) {
        int length = arr.length;
        int[] brr = new int[length];
        int indexBrr = length - 1;

        for (int i = 0; i < length; i++) {
            brr[indexBrr] = arr[i];
            indexBrr -= 1;
        }
        for (int i = 0; i < length; i++) {
            System.out.println(brr[i]);
        }
    }

    private static void reverseUSingShort(int[] arr) {
        int length = arr.length;
        int temp;

        for (int i = 0; i < length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[length - i - 1];
            arr[length - i - 1] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner su = new Scanner(System.in);
        System.out.println("Please give the array size: ");

        int n = su.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Please give arr elements:");
            int input = su.nextInt();
            arr[i] = input;
        }

        // Uncomment one of the following methods to test
        // reverse(arr);
        reverseUSingShort(arr);

        System.out.println("Reversed array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
