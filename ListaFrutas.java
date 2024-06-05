package vetor;

import java.util.ArrayList;

public class ListaFrutas {

	public static void main(String[] args) {
	ArrayList<String> frutas = new ArrayList<String>();
				
				frutas.add("Morango");// Adicionando elementos ao ArrayList
				frutas.add("Pitaya");
				frutas.add("Uva");
				frutas.add("Abacaxi");
				frutas.add("Banana");
				frutas.add("Amora");
				frutas.add("Pessêgo");
				
				System.out.println(frutas);
				
				frutas.remove(5);
				frutas.remove(4);
				frutas.remove(3);
				frutas.remove(1);
				frutas.remove(0);
				
				System.out.println(frutas);
				System.out.println(frutas.size());  // Obtendo o tamanho do ArrayList

	}

}
