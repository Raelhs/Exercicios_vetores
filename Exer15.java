//Dado um vetor de números inteiros, com capacidade limitada a 50 elementos, faça um programa que construa um menu com as seguintes opções:

//- “1 – Incluir valor”: nesta opção inclua o valor no fim do vetor, se houver espaço. Informe o usuário se o valor foi incluído no vetor ou não;
//- “2 – Pesquisar valor”: nesta opção leia um valor e informe se o mesmo está no vetor;
//- “3 – Alterar valor”: nesta opção informe um número a ser alterado e um novo número a 
//ser colocado no lugar (só para a primeira ocorrência deste número). Caso o número a ser alterado exista no vetor, substitua-o 
//pelo novo número. Caso contrário, informe “número não encontrado”;
//- “4 – Excluir valor”: nesta opção leia um valor e, caso ele esteja no 
//vetor, exclua-o. Informe o usuário se o valor foi excluído do vetor ou não. A posição que foi excluída o valor deve ser preenchida pelo valor seguinte, sucessivamente até o final dos valores do vetor;
//- “5 – Mostrar valores”: nesta opção mostre todos os valores armazenados no vetor;
//- “0 – Sair do sistema”: nesta opção deve ser finalizada a execução do programa.

//O menu deve-se repetir até que o usuário escolha a opção 0.

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
			System.out.print("Escolha uma opção: ");
			opcao = entrada.nextInt();

			switch (opcao) {
			case 1:
				if (tamanho < vetor.length) {
					System.out.print("Informe o valor a ser incluído: ");
					int valor = entrada.nextInt();
					vetor[tamanho] = valor;
					tamanho++;
					System.out.println("Valor incluído no vetor.");
				} else {
					System.out.println("O vetor está cheio. Não é possível incluir mais valores.");
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
					System.out.println("O valor está presente no vetor.");
				} else {
					System.out.println("O valor não foi encontrado no vetor.");
				}
				break;

			case 3:
				System.out.print("Informe o número a ser alterado: ");
				int numeroAntigo = entrada.nextInt();
				System.out.print("Informe o novo número: ");
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
					System.out.println("Número não encontrado no vetor.");
				}
				break;

			case 4:
				System.out.print("Informe o valor a ser excluído: ");
				int valorExclusao = entrada.nextInt();
				boolean excluido = false;
				for (int i = 0; i < tamanho; i++) {
					if (vetor[i] == valorExclusao) {
						for (int j = i; j < tamanho - 1; j++) {
							vetor[j] = vetor[j + 1];
						}
						tamanho--;
						excluido = true;
						System.out.println("Valor excluído com sucesso.");
						break;
					}
				}
				if (!excluido) {
					System.out.println("Valor não encontrado no vetor.");
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
				System.out.println("Opção inválida.");
			}
		} while (opcao != 0);
	}
}
