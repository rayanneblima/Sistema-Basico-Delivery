package delivery;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Programa {
	static Scanner teclado = new Scanner(System.in);
		
	public static void main(String[] args) throws Exception {
		Lanche lanche;
		int opcao;
		
		System.out.println("\t ----------SISTEMA DE DELIVERY----------");
		System.out.println("Ol�aaa, Cliente! Dia lindo pra comer algo gostoso, n�?! =)");
		System.out.println("\t ----------Menu---------- \n\t[1] Sandu�ches \n\t[2] Massas \n\t[3] Bolos \n");
		System.out.print("Informe aqui qual vai ser a escolha de hoje: ");
		opcao = teclado.nextInt();
		
		while(opcao != 1 && opcao != 2 && opcao != 3) {
			System.out.println("Op��o inv�lida!\n\n");
			System.out.println("\t ----------MENU---------- \n\t[1] Sandu�ches \n\t[2] Massas \n\t[3] Bolos \n");
			System.out.print("Informe aqui qual vai ser a escolha de hoje: ");
			opcao = teclado.nextInt();
			teclado.nextLine();
		}
		
		if(opcao == 1) {
			System.out.println("\nAcertou em cheio pedindo um sandu�che hoje ein!");
			lanche = new Sanduiche();
			System.out.println("Agora s� falta escolher os ingredientes do seu lanche....");
			menuSanduiche((Sanduiche) lanche); // casting 
		}
		
		
		
	}
	
	public static void menuSanduiche(Sanduiche lanche) throws Exception {
	  	String[] ingredientes = new String[10];
		int i = 0;
		
		 do {
			System.out.println("Informe o " + (i+1) + "� ingrediente ou aperte [0] para finalizar o pedido: "); 
			ingredientes[i] = teclado.next();
			
			if(ingredientes[0].equals("0")) {
				System.out.println("Voc� n�o informou nenhum ingrediente!");
				menuSanduiche((Sanduiche) lanche);
			}
			
			i++;
		} while(i < 10 && !ingredientes[i-1].equals("0"));
		 
		lanche.setIngredientes(ingredientes);
		System.out.println("Agora informe a dist�ncia em km at� o local de entrega: "); 
		int distancia = teclado.nextInt();
		System.out.println("\tProcessando o pedido...");
		System.out.print("\t0% ");
		TimeUnit.SECONDS.sleep(2);
		System.out.print(">>>>>");
		TimeUnit.SECONDS.sleep(2);
		System.out.print(">>>>>");
		TimeUnit.SECONDS.sleep(2);
		System.out.print(">>>>>");
		TimeUnit.SECONDS.sleep(2);
		System.out.print(">>>>>");
		TimeUnit.SECONDS.sleep(2);
		System.out.print(">>>>>");
		TimeUnit.SECONDS.sleep(2);
		System.out.println(" 100%");
		TimeUnit.SECONDS.sleep(2);
		System.out.println("\tO pedido ir� chegar em " + lanche.calculaTempoEntrega(distancia) + " minutos.\n");
		System.out.println("\tAgradecemos pela compra =)\n\n");
		System.out.println("\t ----------FINALIZADO----------");
	}
	
	public static String[] receberIngredientes() {
		String opcao;
		String[] vetorAuxiliar = new String[10];
		
		System.out.println("Informe aqui, um a um, o(s) ingrediente(s) quando decidir. [tecle '0' quando finalizar e vamos confirmar o seu pedido]");
		
		for(int i = 0; i < 10; i++) {
			opcao = teclado.nextLine();
			vetorAuxiliar[i] = opcao;
			
			if(vetorAuxiliar[0].equals("0")) {
				System.out.println("Voc� n�o escolheu nenhum ingrediente!");
				receberIngredientes();				
			}
		}
		return vetorAuxiliar;
	}
	
	public static void menuBolo(Bolo lanche) {
		
	}
		
}

