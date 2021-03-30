  
package com.senati.eti;

import java.util.Scanner;
public class Caso7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] numero = new int[3][4];
		
		System.out.println("LECTURA DE N�MEROS");
		System.out.println("------------------");
		
		int num_mayor = 0, num_menor = 0;
		float suma = 0;
		
		for(int f = 0; f < numero.length; f++) {
			System.out.println("\nDatos de la fila: " + (f + 1));
			System.out.println("----------------------");
			
			for(int c = 0; c < numero[0].length;c++) {
				System.out.print("N�mero " + (c + 1) + ": ");
				numero[f][c] = sc.nextInt();
				
				suma = suma + numero[f][c];
				
				if (f == 0 && c == 0) {
					num_mayor = numero[0][0];
					
				}
				
				if (numero[f][c] > num_mayor) num_mayor = numero[f][c];
				
				if(f == 0 && c == 0) {
					num_menor = numero[f][c];
				}
				if (numero[f][c] < num_menor) num_menor = numero[f][c];
			}
		}
		float promedio = (suma / numero.length) /4;
		
		System.out.println("\n------ Resultados------");
		System.out.println("-----------------------");
		System.out.println("N�mero mayor.......: " + num_mayor);
		System.out.println("N�mero menor.......: " + num_menor);
		System.out.println("Sumatoria..........: " + suma);
		System.out.println("Promedio...........: " + promedio);

	}

}
