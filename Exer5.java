//Fa�a um algoritmo que atribua valores a um vetor de 100 posi��es de acordo com o quadrado do seu �ndice.
//Ex:
//[0] = 0
//[1] = 1
//[2] = 4
//[3] = 9

package exercicios_vetor;

public class Exer5 {

	public static void main(String[] args) {

		int[] vetor = new int[100];

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = i * i;
			System.out.println("[" + i + "] = " + vetor[i]);
		}
	}

}
