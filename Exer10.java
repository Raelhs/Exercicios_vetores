//Descreva um algoritmo que leia 12 valores reais e os coloque em um vetor de 12 posições do tipo real.
//Em seguida, modifique o vetor de modo que os valores das posições ímpares sejam aumentados em 5% e os das posições 
//pares sejam aumentados em 2%.
//Imprima o vetor resultante

package exercicios_vetor;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer10 {
	public static void main(String[] args) {

		DecimalFormat deci = new DecimalFormat("0.00");
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		double[] vetor = new double[12];

		for (int i = 0; i < 12; i++) {
			System.out.print("Digite o valor " + (i + 1) + ": ");
			vetor[i] = entrada.nextDouble();
		}

		for (int i = 0; i < 12; i++) {
			if (i % 2 == 0) {
				vetor[i] *= 1.05;
			} else {
				vetor[i] *= 1.02;
			}
		}

		System.out.println("\nVetor resultante:");
		for (int i = 0; i < 12; i++) {
			System.out.println("Posição " + (i + 1) + ": " + deci.format(vetor[i]));
		}
	}
}
