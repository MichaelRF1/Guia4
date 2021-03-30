package com.senati.eti;

public class Caso6 {

	public static void main(String[] args) {
		// { -> ALT + 123
		// } -> ALT + 135
		String[][] datos = {{"Michael Reques", "Josue Diaz", "Luciana Diaz"},
			              {"Chancay", "Comas", "Puente Piedra"}};
			                
		// datos.length -> Cantidad de filas de la matriz...(2)
	    // datos[0]. length  -> Cantidad de elementos de arreglo de la 1ra fila
		
		// Impresion de valores de la materia por filas
		System.out.println("...............IMPRESION POR FILAS........");
		System.out.println("===========================================");
	    for (int f = 0; f < datos.length; f++) {
	    	for (int c = 0; c < datos[0].length; c++)
	    		System.out.print(String.format("%-20s", datos[f][c]) + "\t");
	    	
	    	System.out.println();
	    	
	    }
	    
	 // Impresion de valores de la materia por columnas
	 		System.out.println("...............IMPRESION POR COLUMNAS........");
	 		System.out.println("===========================================");
	 		for (int c = 0; c < datos[0].length; c++) {
	 	         for (int f = 0; f < datos.length; f++) 
	 	    		System.out.print(String.format("%-20s", datos[f][c]) + "\t");
	 	    	
	 	    	System.out.println();
	   }
	}

}
