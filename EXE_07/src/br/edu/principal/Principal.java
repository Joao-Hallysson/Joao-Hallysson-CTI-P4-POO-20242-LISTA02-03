package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cont, num1, num2, res;
		num1 = 0;
		num2 = 1;
		System.out.println("Número 1 = "+ num1);
		System.out.println("Número 2 = "+ num2);
		for (cont = 3; cont <= 8; cont++) {
			res = num1 + num2;
			System.out.println(res);
			num1 = num2;
			num2 = res;
		}
	}

}
