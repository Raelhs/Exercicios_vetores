//Faça um algoritmo em que o usuário insere um número em um índice específico que ele mesmo informou

package exercicios_vetor;

import java.util.Scanner;

public class Exer7 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o tamanho do vetor: ");
		int tamanho = entrada.nextInt();
		int[] meuVetor = new int[tamanho];

		for (int i = 0; i < tamanho; i++) {
			meuVetor[i] = 1;
		}

		System.out.print("Digite o índice onde deseja colocar o número 0: ");
		int indice = entrada.nextInt();

		if (indice < 0 || indice >= tamanho) {
			System.out.println("Índice inválido!");
		} else {
			meuVetor[indice] = 0;
			System.out.println("Número 0 inserido no índice " + indice);
		}

		System.out.print("Vetor após a modificação: ");
		for (int num : meuVetor) {
			System.out.print(num + " ");
		}

		entrada.close();
	}
}