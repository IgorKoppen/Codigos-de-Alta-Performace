package exercicios;

import java.util.Scanner;

public class Ex2 {

		public static int ALUNOS = 30;

		public static void main(String[] args) {
			int rm[] = new int[ALUNOS];
			double nota1[] = new double[ALUNOS];
			double nota2[] = new double[ALUNOS];
			
			int n = entradaDados(rm,nota1,nota2);
			double media[] = calculaMedia(nota1,nota2, n);
			int aprovados[] = alunoAprovado(media,rm,n);
			
	 for(int i=0;i < n; i++){
		 System.out.println("Media do aluno "+ rm[i] + " :" + media[i] + "\n");
	 }
	 System.out.println("RM dos alunos aprovados: ");
	 for(int i = 0; i < n; i++){
  	   System.out.println("RM: "+ aprovados[i]);
     }	
		}

	public static int entradaDados(int rm[], double nota1[], double nota2[]){
		Scanner teclado = new Scanner(System.in);
		int rmTemp = 0,index = 0;
	       while(rmTemp >= 0 && ALUNOS > index){
	    	     System.out.println("Digite o RM do aluno " + (index+1)+" :");
	    	     rmTemp = teclado.nextInt();
	    	     if(rmTemp < 0){
	    	    	 break;
	    	     }
	    	     
	    	     rm[index] = rmTemp;
	    	     System.out.println("Digite a nota1 do aluno " + (index+1)+" :");
	    	     nota1[index]  = teclado.nextDouble(); 	   
	    	     System.out.println("Digite o nota2 do aluno " + (index+1) +" :");
	    	     nota2[index]  = teclado.nextDouble();
	    	     
	    	  index++;
	       }
	      
			teclado.close();
		return index;
	}
	public static double[] calculaMedia(double[] nota1, double[] nota2, int index){
		double media[] = new double[ALUNOS];
		 for(int i=0; i < index; i++){
	  	   media[i] = (nota1[i] + nota2[i]) / 2;
	  	   }
		return media;
	}
	public static int[] alunoAprovado(double[] media,int[] rm, int index){
		int aprovados[] = new int[ALUNOS];
		int nAp = 0;
		
		  for(int i=0; i < index; i++){
	   	   if(media[i] >= 6){
	 	    	 aprovados[nAp] = rm[i];
	 	    	 nAp++;
	   	   }
	      }
		  
		return aprovados;
}
}