package teste;

import pilhas.PilhaInt;

public class MainTeste {

	public static void main(String[] args) {

		PilhaInt pilha = new PilhaInt();

		pilha.init();

		pilha.esvazia();

		System.out.println();
		if (!pilha.isEmpty())
			System.out.println("Valor retirado da pilha: " + pilha.top());
		else
			System.out.println("Pilha vazia");

		if (!pilha.isEmpty())
			System.out.println("Valor retirado da pilha: " + pilha.pop());
		else
			System.out.println("Pilha vazia");
		if (!pilha.isEmpty())
			System.out.println("Valor retirado da pilha: " + pilha.pop());
		else
			System.out.println("Pilha vazia");

	}

}
