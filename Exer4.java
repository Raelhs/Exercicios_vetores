//Faça um algoritmo que descubra se uma array de 5 elementos possui o número que o usuário entrou.
//Imprima também o seu índice

package exercicios_vetor;

import java.util.Scanner;

public class Exer4 {

	public static void main(String[] args) {

		int[] elementos = { 10, 15, 20, 25, 30 };

		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int numeroBuscado = entrada.nextInt();

		boolean encontrado = false;
		int indiceEncontrado = -1;

		for (int i = 0; i < elementos.length; i++) {
			if (elementos[i] == numeroBuscado) {
				encontrado = true;
				indiceEncontrado = i;
				break;
			}
		}

		if (encontrado) {
			System.out.println("Número encontrado no índice " + indiceEncontrado);
		} else {
			System.out.println("Número não encontrado na array.");
		}
	}
}