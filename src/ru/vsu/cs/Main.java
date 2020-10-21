package ru.vsu.cs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int x = readNumber();
        
        if (performedComparisonNumberSegment(x)) {
            findFigureNumber(x);
        }
        else{
            printAdverseAnswer();
        }
    }

    public static void findFigureNumber(int num) {
        int max = 0;
        int min = 9;

        while (true) {
            int a = findRestNumber(num);

            if(max < a) {
                max = a;
            }

            if(min > a) {
                min = a;
            }

            num = num/10;

            if(num == 0) {
                break;
            }
        }

        printValueMax(max);
        printValueMin(min);
    }

    public static int readNumber() {
        Scanner scn = new Scanner(System.in);
        System.out.print("Input number from -1000 to 1000: ");
        return scn.nextInt();
    }

    public static void printValueMax(int max) {
        System.out.println("max = " + max);
    }

    public static void printValueMin(int min) {
        System.out.println("min = " + min);
    }

    public static void printAdverseAnswer() {
        System.out.println("Number isn`t included in the interval");
    }

    public static boolean performedComparisonNumberSegment(int x) {
        return (x >= -1000 && x <= 1000);
    }

    public static int findRestNumber(int num) {
        return Math.abs(num %10);
    }
}



