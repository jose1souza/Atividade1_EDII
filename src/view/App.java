package view;
import java.util.*;

import model.BubbleSort;
import model.InsertionSort;
import model.Pessoa;
import model.SelectionSort;
import model.SortObserver;

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
		long start,finish;
		Integer[] arquivoCarregado = carregarArquivo("numeros_aleatorios.txt");
		Integer[] arquivoCarregado2 = carregarArquivo("numeros_aleatorios2.txt");
		Integer[] arquivoCarregado3 = carregarArquivo("numeros_aleatorios3.txt");
		SelectionSort<Integer> selectionSort = new SelectionSort<>();
		BubbleSort<Integer> bubbleSort = new BubbleSort<>();
		SortObserver observer = new SortObserver();
		//selectionSort.setObserver(observer);
		InsertionSort<Integer> insertionSort = new InsertionSort<>();
		SortObserver observerInsertion = new SortObserver();
		//selectionSort.setObserver(observerInsertion);
		
		// Usando Selection Sort
		System.out.println("Vetor antes de ordenar: " + 
					Arrays.toString(arquivoCarregado));
		start = System.nanoTime();
		selectionSort.sort(arquivoCarregado);
		finish = System.nanoTime();
		System.out.println("Pessoas depois de ordenar Usando Selection Sort: " + 
					Arrays.toString(arquivoCarregado));
		System.out.println("Tempo em ms: "+ (finish - start));
		System.out.println("/--------------------------------------------------/");
		// Usando Bubble Sort
		System.out.println("Vetor antes de ordenar: " + 
					Arrays.toString(arquivoCarregado2));
		//bubbleSort.sort(observer);
		start = System.nanoTime();
		bubbleSort.sort(arquivoCarregado2);
		finish = System.nanoTime();
		System.out.println("Pessoas depois de ordenar Usando Bubble Sort: " + 
					Arrays.toString(arquivoCarregado2));
		System.out.println("Tempo em ms: "+ (finish - start));
		System.out.println("/--------------------------------------------------/");
		// Usando Insertion Sort
				System.out.println("Vetor antes de ordenar: " + 
							Arrays.toString(arquivoCarregado3));
				//insertionSort.sort(observerInsertion);
				start = System.nanoTime();
				
				insertionSort.sort(arquivoCarregado3);
				finish = System.nanoTime();
				System.out.println("Pessoas depois de ordenar Usando Insertion Sort: " + 
							Arrays.toString(arquivoCarregado3));
				System.out.println("Tempo em ms: "+ (finish - start));
		
	} // fim do main
} // fim da classe App
