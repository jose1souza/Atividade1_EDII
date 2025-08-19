import java.util.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;

public class App {
	public static Pessoa[] vetorDePessoas() {
		return new Pessoa[] { new Pessoa("João", LocalDate.of(1990, 1, 1)), new Pessoa("Ana", LocalDate.of(1992, 2, 2)),
				new Pessoa("Maria", LocalDate.of(1995, 5, 5)), new Pessoa("Pedro", LocalDate.of(1993, 4, 4)),
				new Pessoa("Lucas", LocalDate.of(1991, 6, 6)), new Pessoa("Carlos", LocalDate.of(1988, 3, 3)) };
	}

	public static Integer[] carregarArquivo(String nomeArquivo) throws IOException {
		List<String> linhas = Files.readAllLines(Paths.get(nomeArquivo));
		Integer[] numeros = new Integer[linhas.size()];
		for (int i = 0; i < linhas.size(); i++) {
			numeros[i] = Integer.parseInt(linhas.get(i).trim());
		}
		return numeros;
	}

	static Scanner leia = new Scanner(System.in); // instância do Scanner

	public static void main(String[] args) throws Exception {
		Integer[] arquivoCarregado = carregarArquivo("numeros_aleatorios.txt");
		Integer[] arquivoCarregado2 = carregarArquivo("numeros_aleatorios2.txt");
		SelectionSort<Integer> selectionSort = new SelectionSort<>();
		BubbleSort<Integer> bubbleSort = new BubbleSort<>();
		
		// Usando Selection Sort
		System.out.println("Vetor antes de ordenar: " + 
					Arrays.toString(arquivoCarregado));
		selectionSort.sort(arquivoCarregado);
		System.out.println("Pessoas depois de ordenar Usando Selection Sort: " + 
					Arrays.toString(arquivoCarregado));

		System.out.println("/--------------------------------------------------/");
		// Usando Bubble Sort
		System.out.println("Vetor antes de ordenar: " + 
					Arrays.toString(arquivoCarregado2));

		bubbleSort.sort(arquivoCarregado2);
		System.out.println("Pessoas depois de ordenar Usando Bubble Sort: " + 
					Arrays.toString(arquivoCarregado2));
		
		/*
		Comparator<Pessoa> comparatorData = (a,b) ->  a.getDataBirthDay().compareTo(b.getDataBirthDay());
		// Comparator<Pessoa> comparatorData = (a,b) ->  a.getDataBirthDay().compareTo(b.getDataBirthDay()); max for min
		SelectionSort<Pessoa> selectionSort = new SelectionSort<>();
		
		System.out.println("Pessoas antes de ordenar: " + 
				Arrays.toString(vetorPessoas));
		selectionSort.sort(vetorPessoas,comparatorData);
		System.out.println("Pessoas depois de ordenar: " + 
				Arrays.toString(vetorPessoas));
		
		Integer[] arquivoCarregado = carregarArquivo("numeros_aleatorios.txt");

		System.out.println("Vetor antes de ordenar:: " + Arrays.toString(arquivoCarregado));

		BubbleSort<Integer> bsortInteger = new BubbleSort<>();
		bsortInteger.sort(arquivoCarregado);
		System.out.println("Vetor depois de ordenar:" + Arrays.toString(arquivoCarregado));

		Pessoa[] vetorPessoas = vetorDePessoas();
		System.out.println("Pessoas antes de ordenar: " + Arrays.toString(vetorPessoas));

		BubbleSort<Pessoa> bsortPessoa = new BubbleSort<>();
		// Criar comparator por data de nascimento
		bsortPessoa.sort(vetorPessoas);
		System.out.println("Pessoas depois de ordenar: " + Arrays.toString(vetorPessoas));*/

	} // fim do main
} // fim da classe App

/* Número 2 da atividade
  	Fases: 87
  	Comparations: 4872
	Exchanges: 2343
  */