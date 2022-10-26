package application;

import java.util.Scanner;

import entities.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Choose the Currency to convert to Real: ");
		System.out.println("1- Dollar");
		System.out.println("2- Euro");
		System.out.println("3- Japanese Yen");
		int option = sc.nextInt();
		System.out.println("How many do you want to convert?");
		double quantity = sc.nextDouble();
		System.out.printf("Amount in reais = R$ %.2f%n ",CurrencyConverter.conversor(option, quantity));
		
		sc.close();
	}

}
