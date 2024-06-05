package vetor;
import java.util.ArrayList;
import java.util.Arrays;
public class Exemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String[] disciplinas = {"matemática", "filosofia", "história", "física"};
	ArrayList<String> novaLista = new ArrayList<String>(Arrays.asList(disciplinas));
	novaLista.add("geografia");
	novaLista.add("Lingua Inglesa");
	
	for (String i: novaLista)
	{
	System.out.println("Disciplina: " + i);
	}
  }
}
