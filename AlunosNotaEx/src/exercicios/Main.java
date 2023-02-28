package exercicios;


import java.util.Scanner;;

public class Main {
	
public static int ALUNOS = 30;

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int rm[] = new int[ALUNOS];
		double nota1[] = new double[ALUNOS];
		double nota2[] = new double[ALUNOS];
		double media[] = new double[ALUNOS];
		int aprovados[] = new int[ALUNOS];
		int nAp = 0,rmTemp = 0,index = 0;
		
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
       
       for(int i=0; i < index; i++){
    	   media[i] = (nota1[i] + nota2[i]) / 2;
    	   System.out.println("Media do aluno "+ rm[i] + " :" + media[i] + "\n");
       }
       
       System.out.println("RM dos alunos aprovados: ");
       
       
       for(int i=0; i < index; i++){
    	   if(media[i] >= 6){
  	    	 aprovados[nAp] = rm[i];
  	    	 nAp++;
    	   }
       }

       for(int i = 0; i <nAp; i++){
    	   System.out.println("RM: "+ aprovados[i]);
       }

		teclado.close();
	}

}
