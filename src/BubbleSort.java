import java.util.*;

public class BubbleSort<T> {
	private void troca(T[] array, int i, int j){
        T temporaria = array[i]; // armazena temporariamente
        array[i] = array[j]; // substitui os valores de i e j
        array[j] = temporaria;
	} // fim do metódo troca  
	
	public T[] sort(T[] array, Comparator<T> comparator) {
		int n = array.length; // este é o n
		for(int fase=1;fase<n;fase++) {
			for(int comparacoes=0;comparacoes<n-fase;comparacoes++) { // percorre até o ultimo que não está organizado
				if(comparator.compare(array[comparacoes], array[comparacoes+1]) > 0) { // compara se o primeiro valor é maior que o próximo
					troca(array,comparacoes,comparacoes+1); // troca se for maior
				} // fim do if
			} // fim do for de comparacoes
		} // fim do for da fase
		return array;
	} // fim do metódo sort
	
	public T[] sort(T[] array, Comparator<T> comparator, boolean verbose) { // metódo para caso o queira que detalhe as fases
		Scanner leia = new Scanner(System.in);
		if(verbose==true) {
		int n = array.length; // este é o n
		for(int fase=1;fase<n;fase++) {
			System.out.println("Fase: "+fase); // mostrando a cada fase
			System.out.println(Arrays.toString(array));// como o vetor está durante a fase
			leia.nextLine(); // pause
			for(int comparacoes=0;comparacoes<n-fase;comparacoes++) { // percorre até o ultimo que não está organizado
				if(comparator.compare(array[comparacoes], array[comparacoes+1]) > 0) { // compara se o primeiro valor é maior que o próximo
					troca(array,comparacoes,comparacoes+1); // troca se for maior
				} // fim do if
			} // fim do for de comparacoes
		} // fim do for da fase
	} // fim do if de verbose
		return array;
	} // fim do metódo sort
	
	public T[] sort(T[] array) { // Este vai pegar o comparator e passar para o sort independente de seu tipo
		return sort(array, (a,b)->((Comparable<T>) a).compareTo(b));
	}
} // fim da classe

/* Comparator retorna 
 0 quando iguais
 -1 para menores 
 e 1 para maiores
 */
 