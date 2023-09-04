//Faça um programa para ler os valores de dois vetores de inteiros, cada um contendo 10 elementos.
//Crie um terceiro vetor em que cada elemento é a soma dos valores contidos nas posições respectivas dos vetores originais.
//Por exemplo, vetor1 = [1,2,3] vetor2 = [1,5,6] vetor3 = [2,7,9].
//Exiba, ao final, os três vetores na tela.

package exercicios_vetor;

import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {

		try (Scanner entrada = new Scanner(System.in)) {
			int[] vetor1 = new int[10];
			int[] vetor2 = new int[10];
			int[] vetor3 = new int[10];

			System.out.println("Digite os valores para o primeiro vetor:");
			for (int i = 0; i < 10; i++) {
				System.out.print("Valor " + (i + 1) + ": ");
				vetor1[i] = entrada.nextInt();
			}

			System.out.println("Digite os valores para o segundo vetor:");
			for (int i = 0; i < 10; i++) {
				System.out.print("Valor " + (i + 1) + ": ");
				vetor2[i] = entrada.nextInt();
			}

			for (int i = 0; i < 10; i++) {
				vetor3[i] = vetor1[i] + vetor2[i];
			}

			System.out.println("Vetor 1:");
			for (int i = 0; i < 10; i++) {
				System.out.print(vetor1[i] + " ");
			}
			System.out.println();

			System.out.println("Vetor 2:");
			for (int i = 0; i < 10; i++) {
				System.out.print(vetor2[i] + " ");
			}
			System.out.println();

			System.out.println("Vetor 3 (soma dos elementos de vetor1 e vetor2):");
			for (int i = 0; i < 10; i++) {
				System.out.print(vetor3[i] + " ");
			}
		}
		System.out.println();
	}
}