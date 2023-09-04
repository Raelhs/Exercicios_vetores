//Descreva um algoritmo que leia 12 valores reais e os coloque em um vetor de 12 posições do tipo real.
//Imprima quais valores desses informados são maiores que a média dos valores.

package exercicios_vetor;

import java.util.Scanner;

public class Exer11 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")

		Scanner entrada = new Scanner(System.in);
		double[] vetor = new double[12];
		double soma = 0;

		for (int i = 0; i < 12; i++) {
			System.out.print("Digite o valor " + (i + 1) + ": ");
			vetor[i] = entrada.nextDouble();
			soma += vetor[i];
		}

		double media = soma / 12;

		System.out.println("Valores maiores que a média:");
		for (int i = 0; i < 12; i++) {
			if (vetor[i] > media) {
				System.out.println(vetor[i]);
			}
		}
	}
}