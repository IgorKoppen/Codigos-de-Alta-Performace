package ex4;


import java.util.Scanner;

import pilhas.PilhaInt;

public class DecBin {
	
	static PilhaInt pilha = new PilhaInt();
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numDec = 0;
		
		System.out.println("Escreva o numero em decimal: ");
		numDec = teclado.nextInt();
		ConverterBin(numDec);
		pilha.esvazia();
		
		
		teclado.close();
		
	}
	public static void ConverterBin(int numDec){
	 int resto = 0;
		while(numDec != 0){
		      resto = numDec % 2;
		      pilha.push(resto);
		      numDec = numDec / 2;	
		}
	}

}
