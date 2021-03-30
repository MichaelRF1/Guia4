
public class Caso1 {

	public static void main(String[] args) {
		String[] nombre = new String[4];
		
		nombre[0] = "Michael Reques";
		nombre[1] = "Juan Carlos";
		nombre[2] = "Rodolfo Aurelio";
		nombre[3] = "Benito Camelos";
		
		for (int x = 0; x < nombre.length; x++)
			System.out.println("Nombre " + (x + 1) + ": " + nombre[x]);

	}

}
