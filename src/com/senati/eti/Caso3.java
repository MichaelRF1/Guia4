package com.senati.eti;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Caso3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Integer[] numeros = new Integer[5];
		
		System.out.println("LECTURA DE NUMEROS");
		System.out.println("------------------");
		
		for (int x = 0; x <= numeros.length - 1; x++) {
			System.out.print("Ingrese numero " + (x + 1) + ": ");
			numeros[x] = sc.nextInt();
		}
		
		// Ordenar de forma ascendete
		Arrays.sort(numeros); 
		
		System.out.println("\nNUMEROS ORDENADOS DE FORMA ASCENDETE");
		System.out.println("------------------------------------");
		for (int x = 0; x < numeros.length; x++)
			System.out.println("Numero " + (x + 1) + ": " + numeros[x]);
			
		// Ordenar de forma descendente
		Arrays.sort(numeros, Collections.reverseOrder()); 
			
		System.out.println("\nNUMEROS ORDENADOS DE FORMA DESCENDETE");
		System.out.println("------------------------------------");
		for (int x = 0; x < numeros.length; x++)
		System.out.println("Numero " + (x + 1) + ": " + numeros[x]);
		

	}

}
