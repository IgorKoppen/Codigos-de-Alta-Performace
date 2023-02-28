package exercicios;

import java.util.Scanner;

public class Ex2 {

	public static int ALUNOS = 30;

	public static void main(String[] args) {
		int rm[] = new int[ALUNOS];
		double nota1[] = new double[ALUNOS];
		double nota2[] = new double[ALUNOS];
		int aprovados[] = new int[ALUNOS];
		double media[] = new double[ALUNOS];
		int n = entradaDados(rm, nota1, nota2);
		calculaMedia(nota1, nota2, n, media);
		int NumAprovados = alunoAprovado(media, rm, n, aprovados);

		for (int i = 0; i < n; i++) {
			System.out.println("Media do aluno  " + rm[i] + " :" + media[i] + "\n");
		}
		System.out.println("RM dos alunos aprovados: ");
		for (int i = 0; i < NumAprovados; i++) {
			System.out.println("RM: " + aprovados[i]);
		}
	}

	public static int entradaDados(int rm[], double nota1[], double nota2[]) {
		Scanner teclado = new Scanner(System.in);
		int rmTemp = 0, n = 0;
		while (rmTemp >= 0 && ALUNOS > n) {
			System.out.println("Digite o RM do aluno " + (n + 1) + " :");
			rmTemp = teclado.nextInt();
			if (rmTemp < 0) {
				break;
			}
			rm[n] = rmTemp;
			System.out.println("Digite a nota1 do aluno " + (n + 1) + " :");
			nota1[n] = teclado.nextDouble();
			System.out.println("Digite o nota2 do aluno " + (n + 1) + " :");
			nota2[n] = teclado.nextDouble();

			n++;
		}
		teclado.close();
		return n;
	}
	public static void calculaMedia(double[] nota1, double[] nota2, int n, double[] media) {
		for (int i = 0; i < n; i++) {
			media[i] = (nota1[i] + nota2[i]) / 2;
		}
	}
	public static int alunoAprovado(double[] media, int[] rm, int n, int[] aprovados) {
		int nAp = 0;
		for (int i = 0; i < n; i++) {
			if (media[i] >= 6) {
				aprovados[nAp] = rm[i];
				nAp++;
			}
		}

		return nAp;
	}
}