/*
Question : Write a program to print the given number in ascending order.
 */

import java.util.Scanner;

public class Main {
    static void PrintNumber(int a){
        if (a == 6){
            return;
        }
        System.out.println(a);
        PrintNumber(a + 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int a = sc.nextInt();
        System.out.println("Printing the result :");
        PrintNumber(a);
    }
}