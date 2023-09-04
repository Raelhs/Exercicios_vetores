//Dado um vetor de n�meros inteiros, com capacidade limitada a 50 elementos, fa�a um programa que construa um menu com as seguintes op��es:

//- �1 � Incluir valor�: nesta op��o inclua o valor no fim do vetor, se houver espa�o. Informe o usu�rio se o valor foi inclu�do no vetor ou n�o;
//- �2 � Pesquisar valor�: nesta op��o leia um valor e informe se o mesmo est� no vetor;
//- �3 � Alterar valor�: nesta op��o informe um n�mero a ser alterado e um novo n�mero a 
//ser colocado no lugar (s� para a primeira ocorr�ncia deste n�mero). Caso o n�mero a ser alterado exista no vetor, substitua-o 
//pelo novo n�mero. Caso contr�rio, informe �n�mero n�o encontrado�;
//- �4 � Excluir valor�: nesta op��o leia um valor e, caso ele esteja no 
//vetor, exclua-o. Informe o usu�rio se o valor foi exclu�do do vetor ou n�o. A posi��o que foi exclu�da o valor deve ser preenchida pelo valor seguinte, sucessivamente at� o final dos valores do vetor;
//- �5 � Mostrar valores�: nesta op��o mostre todos os valores armazenados no vetor;
//- �0 � Sair do sistema�: nesta op��o deve ser finalizada a execu��o do programa.

//O menu deve-se repetir at� que o usu�rio escolha a op��o 0.

package exercicios_vetor;

import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		int[] vetor = new int[50];
		int tamanho = 0;

		int opcao;
		do {
			System.out.println("\nMenu:");
			System.out.println("1 - Incluir valor");
			System.out.println("2 - Pesquisar valor");
			System.out.println("3 - Alterar valor");
			System.out.println("4 - Excluir valor");
			System.out.println("5 - Mostrar valores");
			System.out.println("0 - Sair do sistema");
			System.out.print("Escolha uma op��o: ");
			opcao = entrada.nextInt();

			switch (opcao) {
			case 1:
				if (tamanho < vetor.length) {
					System.out.print("Informe o valor a ser inclu�do: ");
					int valor = entrada.nextInt();
					vetor[tamanho] = valor;
					tamanho++;
					System.out.println("Valor inclu�do no vetor.");
				} else {
					System.out.println("O vetor est� cheio. N�o � poss�vel incluir mais valores.");
				}
				break;

			case 2:
				System.out.print("Informe o valor a ser pesquisado: ");
				int valorPesquisa = entrada.nextInt();
				boolean encontrado = false;
				for (int i = 0; i < tamanho; i++) {
					if (vetor[i] == valorPesquisa) {
						encontrado = true;
						break;
					}
				}
				if (encontrado) {
					System.out.println("O valor est� presente no vetor.");
				} else {
					System.out.println("O valor n�o foi encontrado no vetor.");
				}
				break;

			case 3:
				System.out.print("Informe o n�mero a ser alterado: ");
				int numeroAntigo = entrada.nextInt();
				System.out.print("Informe o novo n�mero: ");
				int numeroNovo = entrada.nextInt();
				boolean alterado = false;
				for (int i = 0; i < tamanho; i++) {
					if (vetor[i] == numeroAntigo) {
						vetor[i] = numeroNovo;
						alterado = true;
						System.out.println("Valor alterado com sucesso.");
						break;
					}
				}
				if (!alterado) {
					System.out.println("N�mero n�o encontrado no vetor.");
				}
				break;

			case 4:
				System.out.print("Informe o valor a ser exclu�do: ");
				int valorExclusao = entrada.nextInt();
				boolean excluido = false;
				for (int i = 0; i < tamanho; i++) {
					if (vetor[i] == valorExclusao) {
						for (int j = i; j < tamanho - 1; j++) {
							vetor[j] = vetor[j + 1];
						}
						tamanho--;
						excluido = true;
						System.out.println("Valor exclu�do com sucesso.");
						break;
					}
				}
				if (!excluido) {
					System.out.println("Valor n�o encontrado no vetor.");
				}
				break;

			case 5:
				System.out.println("Valores presentes no vetor:");
				for (int i = 0; i < tamanho; i++) {
					System.out.print(vetor[i] + " ");
				}
				System.out.println();
				break;

			case 0:
				System.out.println("Saindo do sistema...");
				break;

			default:
				System.out.println("Op��o inv�lida.");
			}
		} while (opcao != 0);
	}
}
