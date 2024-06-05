package vetor;
import java.util.ArrayList;
import java.util.Scanner;
public class ListaCarros {

	public static void main(String[] args) {
	ArrayList<String> carros = new ArrayList<String>();
	Scanner ler = new Scanner(System.in);
	int i=0;
	
	carros.add("Onix");// Adicionando elementos ao ArrayList
	carros.add("Corola");
	carros.add("HB20");
	carros.add("Brasilia");
	carros.add("Hilux");
	carros.add("Fusca");
	carros.add("Uno");
	carros.add("Parati");
	carros.add("Jipe");
	carros.add("Gol");
	
	System.out.println(carros);
	System.out.println("Qual desses carros você golstaria de ver? Informe de 0 a 9: ");
	i = ler.nextInt();
	System.out.println(carros.get(i));
	
	}

}
