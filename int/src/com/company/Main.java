package com.company;

import java.util.Random;
import java.util.Scanner;

import static java.lang.System.in;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scanner =new Scanner(in);
        Random random =new Random();
        System.out.println("Kg kiriting:   ");
        int kg = scanner.nextInt();
        int res=kg/1000;
        System.out.println(res+  "T");



    }
}
