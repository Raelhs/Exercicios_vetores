//Crie um vetor de 100 posições
//O usuário vai colocando valores decimais até ele colocar o char n
//Calcular:
//a) Qual o menor número
//b) Qual o maior número
//c) Calcular a média

package exercicios_vetor;

import java.util.Scanner;

public class Exer9 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		double[] vetor = new double[100];
		int tamanhoVetor = 0;

		System.out.println("Digite valores para preencher o vetor (digite 'n' para parar):");

		while (tamanhoVetor < 100) {
			String parada = entrada.next();

			if (parada.equalsIgnoreCase("n")) {
				break;
			}

			try {
				double valor = Double.parseDouble(parada);
				vetor[tamanhoVetor] = valor;
				tamanhoVetor++;
			} catch (NumberFormatException e) {
				System.out.println("Entrada inválida. Digite um número decimal ou 'n' para parar.");
			}
		}

		if (tamanhoVetor > 0) {
			double menor = vetor[0];
			double maior = vetor[0];
			double soma = vetor[0];

			for (int i = 1; i < tamanhoVetor; i++) {
				if (vetor[i] < menor) {
					menor = vetor[i];
				}

				if (vetor[i] > maior) {
					maior = vetor[i];
				}

				soma += vetor[i];
			}

			double media = soma / tamanhoVetor;

			System.out.println("Menor número: " + menor);
			System.out.println("Maior número: " + maior);
			System.out.printf("Média: %.2f" , media);
		} else {
			System.out.println("Nenhum valor foi inserido.");
		}
	}
}
