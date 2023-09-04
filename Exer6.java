//Fa�a um algoritmo que coloque o n�mero 0 no �ndice que o usu�rio escolheu

package exercicios_vetor;

import java.util.Scanner;

public class Exer6 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o tamanho do vetor: ");
		int tamanho = entrada.nextInt();

		int[] meuVetor = new int[tamanho];

		for (int i = 0; i < tamanho; i++) {
			meuVetor[i] = 1;
		}

		System.out.print("Digite o �ndice onde deseja colocar o n�mero 0: ");
		int indice = entrada.nextInt();

		if (indice >= 0 && indice < tamanho) {
			meuVetor[indice] = 0;
			System.out.println("N�mero 0 inserido no �ndice " + indice);
		} else {
			System.out.println("�ndice inv�lido!");
		}

		System.out.print("Vetor ap�s a modifica��o: ");
		for (int num : meuVetor) {
			System.out.print(num + " ");
		}

		entrada.close();
	}

}
