
public class TresEnRaya {
	public static void main(String[] args) {
		// declaracion
		int matriz[][];
		// creacion
		matriz = new int[5][4];
		//recorrer para rellenar
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j]=i;
			}
		}
		//para crearla
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
	}
}
