package com.company;
import java.util.Scanner;

class  printBytesClass {
    public static void printBytes(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter: ");
        double input = in.nextDouble();
        int k = 0;
        while (input >= 1024) {
            input = input / 1024;
            k = k + 1;
        }
        char[] symbols = { 'b','k', 'm', 'g', 't', 'p'};
        if(input >= 0) {
            System.out.print("Result = " + String.format("%.1f", input) + " " + symbols[k]);
        }
        else
            System.out.println("Error");
        if(k!= 0)
        {
            System.out.print("b");
        }
    }
}
public class Main {

    public static void main(String[] args) {
        printBytesClass.printBytes();
    }
}
