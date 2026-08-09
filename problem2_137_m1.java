package com.mycompany.problem2_137_68m1;

import java.util.Scanner;

public class Problem2_137_68M1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double baseSalary = sc.nextDouble();
        double sales = sc.nextDouble();

        double commission = sales * 0.15;
        double totalPay = baseSalary + commission;

        System.out.printf("Total Pay: %.2f%n", totalPay);
    }
}
