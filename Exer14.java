//Um cinema pretende fazer uma pesquisa para avaliar o grau de satisfa��o de seus clientes.
//Trinta deles foram ouvidos e para cada um perguntou-se o sexo 
//(1=feminino 2=masculino), uma nota para o cinema (zero at� dez, valor inteiro) e a idade.

//Baseado nisto fa�a um programa que informe:

//- qual a nota m�dia recebida pelo cinema;
//- qual a nota m�dia atribu�da pelos homens;
//- qual a nota atribu�da pela mulher mais jovem;
//- quantas das mulheres com mais de 50 anos deram nota superior a m�dia recebida pelo cinema.

package exercicios_vetor;

import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		int totalClientes = 30;
		int totalHomens = 0;
		int totalMulheresMais50 = 0;
		int somaNotas = 0;
		int somaNotasHomens = 0;
		int notaMulherMaisJovem = 10;
		int idadeMulherMaisJovem = 0;

		for (int i = 1; i <= totalClientes; i++) {
			System.out.println("Cliente " + i + ":");
			System.out.print("Sexo (1=feminino, 2=masculino): ");
			int sexo = entrada.nextInt();

			System.out.print("Nota para o cinema (0 a 10): ");
			int nota = entrada.nextInt();
			somaNotas += nota;

			if (sexo == 2) {
				totalHomens++;
				somaNotasHomens += nota;
			}

			System.out.print("Idade: ");
			int idade = entrada.nextInt();

			if (sexo == 1 && idade > 50 && nota > (somaNotas / totalClientes)) {
				totalMulheresMais50++;
			}

			if (sexo == 1 && idade < idadeMulherMaisJovem) {
				notaMulherMaisJovem = nota;
				idadeMulherMaisJovem = idade;
			}
		}

		double notaMediaGeral = (double) somaNotas / totalClientes;
		double notaMediaHomens = (double) somaNotasHomens / totalHomens;

		System.out.println("Nota m�dia recebida pelo cinema: " + notaMediaGeral);
		System.out.println("Nota m�dia atribu�da pelos homens: " + notaMediaHomens);
		System.out.println("Nota atribu�da pela mulher mais jovem: " + notaMulherMaisJovem);
		System.out.println("Mulheres com mais de 50 anos que deram nota superior � m�dia: " + totalMulheresMais50);
	}

}
