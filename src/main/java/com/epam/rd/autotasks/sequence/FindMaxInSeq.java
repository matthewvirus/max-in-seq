package com.epam.rd.autotasks.sequence;
import java.util.Scanner;

public class FindMaxInSeq {
    public static int max() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] sNumbers = input.split(" ");
        int[] numbers = new int[sNumbers.length + 1];

        for (int i = 0; i < sNumbers.length; i++) {
            numbers[i] = Integer.parseInt(sNumbers[i]);
        }
        int maxVal = numbers[0];
        for (int i = 0; i < sNumbers.length; i++) {
            if (maxVal < numbers[i] && numbers[i] != 0) {
                maxVal = numbers[i];
            }
        }

        return maxVal;
    }

    public static void main(String[] args) {

        System.out.println("Test your code here!\n");

        // Get a result of your code

        System.out.println(max());
    }
}
