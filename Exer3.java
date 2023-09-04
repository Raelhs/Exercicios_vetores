//Crie uma array de 5 elementos e descubra:
//a) Qual o maior elemento
//b) Qual o menor elemento
//c) A média dos elementos

package exercicios_vetor;

public class Exer3 {

	public static void main(String[] args) {
		int[] elementos = { 10, 5, 8, 3, 7 };

		int maior = elementos[0];
		for (int i = 1; i < elementos.length; i++) {
			if (elementos[i] > maior) {
				maior = elementos[i];
			}
		}
		System.out.println("Maior elemento: " + maior);

		int menor = elementos[0];
		for (int i = 1; i < elementos.length; i++) {
			if (elementos[i] < menor) {
				menor = elementos[i];
			}
		}
		System.out.println("Menor elemento: " + menor);

		int soma = 0;
		for (int elemento : elementos) {
			soma += elemento;
		}
		double media = (double) soma / elementos.length;
		System.out.println("Média dos elementos: " + media);
	}
}