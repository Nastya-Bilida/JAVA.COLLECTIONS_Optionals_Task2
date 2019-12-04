package com.company;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add number: ");
        int number = scanner.nextInt();

        int digitsNumber = (int) Math.log10(number);
        for (int i = (int) Math.pow(10, digitsNumber); i > 0; i /= 10) {
            stack.push(number / i);
            number %= i;
        }
        System.out.print("A number whose numbers go in the reverse order: ");

        while (!stack.empty()) {
            int stackNumber = stack.pop();
            System.out.print(stackNumber);
        }
    }
}
