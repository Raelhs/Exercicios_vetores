//Faça um algoritmo que inverta a ordem de uma array
//(o primeiro elemento vai se tornar o último elemento)
package exercicios_vetor;

import java.util.Scanner;

public class Exer8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o tamanho do array: ");
		int tamanho = scanner.nextInt();
		int[] meuVetor = new int[tamanho];

		for (int i = 0; i < tamanho; i++) {
			meuVetor[i] = 1;
		}

		System.out.print("Digite o índice onde deseja colocar o número 0: ");
		int indice = scanner.nextInt();

		if (indice >= 0 && indice < tamanho) {
			insertNumberAtIndex(meuVetor, indice, 0);
			System.out.println("Número 0 inserido no índice " + indice);
		} else {
			System.out.println("Índice inválido!");
		}

		printArray(meuVetor);

		scanner.close();
	}

	public static void insertNumberAtIndex(int[] array, int index, int number) {
		if (index >= 0 && index < array.length) {
			array[index] = number;
		}
	}

	public static void printArray(int[] array) {
		System.out.print("Array: ");
		for (int num : array) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
}