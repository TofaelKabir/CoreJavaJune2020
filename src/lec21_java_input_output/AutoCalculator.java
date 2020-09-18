package lec21_java_input_output;

import java.text.DecimalFormat;
import java.util.Scanner;

//Fun Game

public class AutoCalculator {

	public static void main(String[] args) {
		System.out.println("Hi, Welcome to Auto Installment Calculator");
		System.out.println("Please eneter your expected car loan amount");
		Scanner input = new Scanner(System.in);
		int loanAmount = input.nextInt();

		System.out.println("Please enter your expected loan term in month (ie 36, 48, 72, 96)");

		int month = input.nextInt();
		System.out.println("Please enter your expected interest rate");

		double interestRate = input.nextFloat();

		double r = interestRate / 100;
		int m = 12;
		int y = month / 12;
		double value = 1 + (r / m);
		double power = m * y;

		double i = (loanAmount * (r / m) / (1 - (1 / (Math.pow(value, power)))));
		double ti = (i * month) - loanAmount;

		int ii = (int) i;
		int tii = (int) ti;

		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println("Total interest rate is $: " + df.format(ti));
		System.out.println("Total interest as flat is $" + tii);
		System.out.println("Your car's monthly payment is $: " + df.format(i));
		System.out.println("Your car's monthly payment as flat is $: " + ii);

	}
}
