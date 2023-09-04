//Crie um vetor de 100 posi��es
//O usu�rio vai colocando valores decimais at� ele colocar o char n
//Calcular:
//a) Qual o menor n�mero
//b) Qual o maior n�mero
//c) Calcular a m�dia

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
				System.out.println("Entrada inv�lida. Digite um n�mero decimal ou 'n' para parar.");
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

			System.out.println("Menor n�mero: " + menor);
			System.out.println("Maior n�mero: " + maior);
			System.out.printf("M�dia: %.2f" , media);
		} else {
			System.out.println("Nenhum valor foi inserido.");
		}
	}
}
