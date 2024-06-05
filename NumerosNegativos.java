package vetor;

import java.util.ArrayList;

public class NumerosNegativos {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		int soma = 0;
		
		numeros.add(-22);// Adicionando elementos ao ArrayList
		numeros.add(-3);
		numeros.add(8);
		numeros.add(-12);
		numeros.add(10);
		
	    for(int numero : numeros){
	    if (numero < 0) { 
	    	soma += numero;
     }
   }
        System.out.println("A soma dos numeros negativos é: " + soma);
	}
}