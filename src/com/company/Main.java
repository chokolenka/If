package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Дано целое число. Если оно является положительным, то прибавить к нему 1;
        // в противном случае не изменять его. Вывести полученное число.
        Scanner in = new Scanner(System.in);
        System.out.print("a:");
        int a= in.nextInt();
        if (a>0) a++;
        System.out.println(a);
        in.close();
    }
}
