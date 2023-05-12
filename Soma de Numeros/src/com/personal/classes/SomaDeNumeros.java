package com.personal.classes;

import java.util.Scanner;

public class SomaDeNumeros {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe um número: ");
		int number1 = scanner.nextInt();
		
		System.out.println("Informe outro número: ");
		int number2 = scanner.nextInt();
		
		
		System.out.println("A soma dos dois números informados é: " + (number1 + number2));
		
		
	}

}
