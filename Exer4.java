//Fa�a um algoritmo que descubra se uma array de 5 elementos possui o n�mero que o usu�rio entrou.
//Imprima tamb�m o seu �ndice

package exercicios_vetor;

import java.util.Scanner;

public class Exer4 {

	public static void main(String[] args) {

		int[] elementos = { 10, 15, 20, 25, 30 };

		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite um n�mero: ");
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
			System.out.println("N�mero encontrado no �ndice " + indiceEncontrado);
		} else {
			System.out.println("N�mero n�o encontrado na array.");
		}
	}
}