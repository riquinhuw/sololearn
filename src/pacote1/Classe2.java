package pacote1;
import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Classe2 {
	
	
	
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		DecimalFormat deci = new DecimalFormat();
		System.out.printf("Rodando o metodo CALC ");
		calc(0,leitor,deci);
		
		}
		
	 	
	
	
	static void calc(double resultado,Scanner leitor,DecimalFormat deci) {
		
		deci.setMaximumFractionDigits(5);
		//deci.setMinimumFractionDigits(2);
				
		System.out.printf("\n\n\n\n\n******SUPER CALCULATOR 2000K******\n\n");
		
		System.out.printf("TOTAL:"+deci.format(resultado) );
		System.out.printf("\n1-SOMA\n2-SUBTRAÇÃO\n3-MULTIPLICAÇÃO\n4-DIVISÃO\n");
		System.out.printf("OPÇÃO: ");
		int escolha = leitor.nextInt();
		clearConsole();
		clrscr();

		switch (escolha) {
		
		case 1:
			resultado = soma(leitor,resultado,deci);
			calc(resultado,leitor,deci);
			break;
			
		case 2:
			resultado = subt(leitor,resultado,deci);
			calc(resultado,leitor,deci);
			break;
			
		case 3:
			resultado = mult(leitor,resultado,deci);
			calc(resultado,leitor,deci);
			break;
			
		case 4:
			resultado = div(leitor,resultado,deci);
			calc(resultado,leitor,deci);
			break;
		
		default:
			System.out.printf("Escolha uma opção valida");
		
		
		}
		
	}
	
	
	static double soma(Scanner leitor,double resultado,DecimalFormat deci){
		
		if(resultado ==0) {
		System.out.printf("\n\n\n\n\n\n\n\n\n\n");
		System.out.printf("SOMA\nTOTAL:"+deci.format(resultado)+"\n");
		System.out.printf("DIGITE O PRIMEIRO VALOR: ");
		resultado += leitor.nextDouble();
		System.out.printf("DIGITE O SEGUNDO VALOR: ");
		resultado += leitor.nextDouble();
		return resultado;
		}else {
			System.out.printf("\n\n\n\n\n\n\n\n\n\n");
			System.out.printf("SOMA\nTOTAL:"+deci.format(resultado)+"\n");
			System.out.printf("DIGITE O VALOR: ");
			resultado += leitor.nextDouble();
			return resultado;
		}
	}
	
	static double subt(Scanner leitor,double resultado,DecimalFormat deci){
		if(resultado ==0) {
			System.out.printf("\n\n\n\n\n\n\n\n\n\n");
			System.out.printf("SUBTRAÇÃO\nTOTAL:"+deci.format(resultado)+"\n");
			System.out.printf("DIGITE O PRIMEIRO VALOR: ");
			resultado = leitor.nextDouble();
			System.out.printf("DIGITE O SEGUNDO VALOR: ");
			resultado -= leitor.nextDouble();
			return resultado;
			}else {
				System.out.printf("\n\n\n\n\n\n\n\n\n\n");
				System.out.printf("SUBTRAÇÃO\nTOTAL:"+deci.format(resultado)+"\n");
				System.out.printf("DIGITE O VALOR: ");
				resultado -= leitor.nextDouble();
				return resultado;
			}				
		
		
	}
	
	static double mult(Scanner leitor,double resultado,DecimalFormat deci){
		if(resultado ==0) {
			System.out.printf("\n\n\n\n\n\n\n\n\n\n");
			System.out.printf("MULTIPLICAÇÃO\nTOTAL:"+deci.format(resultado)+"\n");
			System.out.printf("DIGITE O PRIMEIRO VALOR: ");
			resultado = leitor.nextDouble();
			System.out.printf("DIGITE O SEGUNDO VALOR: ");
			resultado *= leitor.nextDouble();
			return resultado;
			}else {
				System.out.printf("\n\n\n\n\n\n\n\n\n\n");
				System.out.printf("MULTIPLICAÇÃO\nTOTAL:"+deci.format(resultado)+"\n");
				System.out.printf("DIGITE O VALOR: ");
				resultado *= leitor.nextDouble();
				return resultado;
			}				
		
		
	}
	static double div(Scanner leitor,double resultado,DecimalFormat deci){
		if(resultado ==0) {
			System.out.printf("\n\n\n\n\n\n\n\n\n\n");
			System.out.printf("DIVISÃO\nTOTAL:"+deci.format(resultado)+"\n");
			System.out.printf("DIGITE O PRIMEIRO VALOR: ");
			resultado = leitor.nextDouble();
			System.out.printf("DIGITE O SEGUNDO VALOR: ");
			resultado /= leitor.nextDouble();
			return resultado;
			}else {
				System.out.printf("\n\n\n\n\n\n\n\n\n\n");
				System.out.printf("DIVISÃO\nTOTAL:"+deci.format(resultado)+"\n");
				System.out.printf("DIGITE O VALOR: ");
				resultado /= leitor.nextDouble();
				return resultado;
			}				
		
		
	}
	
	public final static void clearConsole()
	{
	    try
	    {
	        final String os = System.getProperty("os.name");

	        if (os.contains("Windows"))
	        {
	            Runtime.getRuntime().exec("cls");
	        }
	        else
	        {
	            Runtime.getRuntime().exec("clear");
	        }
	    }
	    catch (final Exception e)
	    {
	        //  Handle any exceptions.
	    }
	}
	
	public static void clrscr(){
	    //Clears Screen in java
	    try {
	        if (System.getProperty("os.name").contains("Windows"))
	            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	        else
	            Runtime.getRuntime().exec("clear");
	    } catch (IOException | InterruptedException ex) {}
	}

}
