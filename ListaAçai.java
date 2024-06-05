package vetor;
import java.util.ArrayList;
import java.util.Scanner;
public class ListaAçai {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		ArrayList<String> ingredientes = new ArrayList<String>();
	   
		ingredientes.add("Leite Condensado");// Adicionando elementos ao ArrayList
		ingredientes.add("Leite em pó");
		ingredientes.add("Creme de avelã");
		ingredientes.add("Chocolate");
		ingredientes.add("Creme de ninho");
		ingredientes.add("Creme de Waffle");
		ingredientes.add("Paçoca");
		ingredientes.add("Confete");
		ingredientes.add("Choco Ball");
		ingredientes.add("Morango");
		ingredientes.add("Banana");
		ingredientes.add("Kiwi");
		ingredientes.add("Uva");
	
	  System.out.println("O que deseja fazer?");
	  System.out.println("[1]Adicionar Ingrediente");
	  System.out.println("[2]Remover Ingrediente");
	  System.out.println("[3]Manter Ingredientes");
	  int i = ler.nextInt();
	  
	  if (i == 1) {
	 System.out.println("Qual ingrediente você deseja adicionar" );
	 ingredientes.add(ler.next());
	 System.out.println(ingredientes);
	  }
	 
	  else if (i == 2) {
      System.out.println("Qual ingredientes deseja remover? [0 - 13");
      ingredientes.remove(ler.nextInt());
      System.out.println("Nova lista de ingredientes" + ingredientes);
	  }
	  else {
		  System.out.println("Lista de ingredientes" + ingredientes);
	  
	  }
    }
  }

