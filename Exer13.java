//Com o objetivo de determinar o �ndice de afinidade entre um rapaz e uma mo�a cada um
//respondeu um question�rio com 5 perguntas:

//- Gosta de m�sica sertaneja?
//- Gosta de futebol?
//- Gosta de seriados?
//- Gosta de redes sociais?
//- Gosta da Oktoberfest?

//A resposta a cada pergunta pode ser: SIM, N�O ou IND (indiferente). 
//O �ndice de afinidade � medido da seguinte maneira:

//- se ambos deram a mesma resposta soma-se 3 pontos ao �ndice;
//- se um respondeu IND e o outro SIM ou N�O soma-se 1;
//- se um respondeu SIM e o outro N�O subtrai-se 2 ao �ndice.

//Crie  um  vetor  para  armazenar  as  respostas  do  rapaz  e  outro  para  
//armazenar  as respostas da mo�a. Crie um m�todo que possa ler tanto as respostas do rapaz 
//como da mo�a, e outro para calcular e retornar  a  afinidade.  Por  fim, escreva  a 
//afinidade  considerando  os  seguintes intervalos:

//| Afinidade | Mensagem                          |
//|-----------|-----------------------------------|
//| 15        | �Casem!                           |
//| 10 a 14   | �Voc�s t�m muita coisa em comum!� |
//| 5 a 9     | �Talvez n�o d� certo :(�          |
//| 0 a 4     | �Vale um encontro.�               |
//| -1 a -9   | �Melhor n�o perder tempo�         |
//| -10       | �Voc�s se odeiam!�                |

package exercicios_vetor;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		String[] perguntas = { "Gosta de m�sica sertaneja?", "Gosta de futebol?", "Gosta de seriados?",
				"Gosta de redes sociais?", "Gosta da Oktoberfest?" };

		String[] respostasEle = new String[5];
		String[] respostasEla = new String[5];

		System.out.println("Respostas do rapaz:");
		lerRespostas(perguntas, respostasEle, entrada);

		System.out.println("Respostas da mo�a:");
		lerRespostas(perguntas, respostasEla, entrada);

		int afinidade = calcularAfinidade(respostasEle, respostasEla);
		exibirMensagemAfinidade(afinidade);
	}

	public static void lerRespostas(String[] perguntas, String[] respostas, Scanner scanner) {
		for (int i = 0; i < perguntas.length; i++) {
			System.out.print(perguntas[i] + " (SIM/N�O/IND): ");
			respostas[i] = scanner.next().toUpperCase();
		}
	}

	public static int calcularAfinidade(String[] respostasRapaz, String[] respostasMoca) {
		int afinidade = 0;

		for (int i = 0; i < respostasRapaz.length; i++) {
			if (respostasRapaz[i].equals(respostasMoca[i])) {
				afinidade += 3;
			} else if ((respostasRapaz[i].equals("IND") && !respostasMoca[i].equals("IND"))
					|| (!respostasRapaz[i].equals("IND") && respostasMoca[i].equals("IND"))) {
				afinidade += 1;
			} else if ((respostasRapaz[i].equals("SIM") && respostasMoca[i].equals("N�O"))
					|| (respostasRapaz[i].equals("N�O") && respostasMoca[i].equals("SIM"))) {
				afinidade -= 2;
			}
		}

		return afinidade;
	}

	public static void exibirMensagemAfinidade(int afinidade) {
		System.out.print("Afinidade: " + afinidade + " - ");

		if (afinidade == 15) {
			System.out.println("Casem!");
		} else if (afinidade >= 10) {
			System.out.println("Voc�s t�m muita coisa em comum!");
		} else if (afinidade >= 5) {
			System.out.println("Talvez n�o d� certo :(");
		} else if (afinidade >= 0) {
			System.out.println("Vale um encontro.");
		} else if (afinidade >= -9) {
			System.out.println("Melhor n�o perder tempo");
		} else {
			System.out.println("Voc�s se odeiam!");
		}

	}
}
