package vetor;
import java.util.Scanner;
public class Atividade2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a[] = new int [5];
    int soma = 0;
    Scanner ler = new Scanner(System.in);
	
    for (int i =0; i<5; i++) {
    	System.out.println("Digite o valor");
	    a[i]= ler.nextInt();
	    soma += a[i];
    }
	    	
    if (soma > 30 ) {
    System.out.println("O resultado é: " + soma );
	    }
    else { 
	System.out.println("O valor é menor que 30");
	   
    }  
    ler.close();
	}	
}