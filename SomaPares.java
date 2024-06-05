package vetor;
import java.util.ArrayList;
public class SomaPares {

	public static void main(String[] args) {
		//Criando um ArrayList de números inteiros
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		int soma = 0;
		
		numeros.add(5);// Adicionando elementos ao ArrayList
		numeros.add(15);
		numeros.add(8);
		numeros.add(25);
		numeros.add(10);
		
	    for(int numero : numeros){
	    if (numero % 2 == 0) { 
	    	soma += numero;
	    }
	    }
        System.out.println("A soma dos números pares é: " + soma);

	}
	}

