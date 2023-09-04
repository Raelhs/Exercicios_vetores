//Crie uma array de 5 elementos e imprima os últimos elementos por primeiro

package exercicios_vetor;

public class Exer2 {

	public static void main(String[] args) {

		int[] elementos = { 1, 2, 3, 4, 5 };

		for (int i = elementos.length - 1; i >= 0; i--) {
			System.out.println(elementos[i]);
		}
	}

}
