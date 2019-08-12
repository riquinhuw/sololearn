package pacote1;
import java.io.IOException;
import java.util.Scanner;

public class Classe1 {
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		double resultado=0;
		//nome = leitor.nextLine();
		
		System.out.printf("******SUPER CALCULATOR 2000K******\n\n\n");
		System.out.printf("1-SOMA\n2-SUBTRAÇÃO\n3-MULTIPLICAÇÃO\n4-DIVISÃO\n");
		System.out.printf("OPÇÃO: ");
		int escolha = leitor.nextInt();
		clearConsole();
		clrscr();

		switch (escolha) {
		
		case 1:
			soma();
			break;
			
		case 2:
			subt();
			break;
			
		case 3:
			mult();
			break;
			
		case 4:
			div();
			break;
		
		default:
			System.out.printf("Escolha uma opção valida");
		
		
		}
		
		
		
		

	  
	 // System.out.println("Nome:"+nome+"\nIdade:"+idade+"\nSaldo:"+saldo+"\nTier:"+rank+"\nDesqualificado:"+desativado);
		//System.out.printf("\n\nNome:%s \nSaldo:%2f",pessoa1.nome,pessoa1.saldo);
		//System.out.printf("\nmetodo:%s",pessoa1);
		//nome = leitor.nextLine();
		//leitor.close(); é necessario?
		//System.out.printf(nome);
		// pessoa1.
		}
	
	
	static void soma(){
		System.out.printf("DIGITE UM VALOR");
		
		
	}
	
	static void subt(){
				
		
		
	}
	
	static void mult(){
				
		
		
	}
	static void div(){
				
		
		
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
