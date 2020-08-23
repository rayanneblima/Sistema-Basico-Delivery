package delivery;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Programa {
	static Scanner teclado = new Scanner(System.in);
		
	public static void main(String[] args) throws Exception {
		Lanche lanche;
		int opcao;
		
		System.out.println("\t ----------SISTEMA DE DELIVERY----------");
		System.out.println("Oláaaa, Cliente! Dia lindo pra comer algo gostoso, né?! =)");
		System.out.println("\t ----------Menu---------- \n\t[1] Sanduíches \n\t[2] Massas \n\t[3] Bolos \n");
		System.out.print("Informe aqui qual vai ser a escolha de hoje: ");
		opcao = teclado.nextInt();
		
		while(opcao != 1 && opcao != 2 && opcao != 3) {
			System.out.println("Opção inválida!\n\n");
			System.out.println("\t ----------MENU---------- \n\t[1] Sanduíches \n\t[2] Massas \n\t[3] Bolos \n");
			System.out.print("Informe aqui qual vai ser a escolha de hoje: ");
			opcao = teclado.nextInt();
			teclado.nextLine();
		}
		
		if(opcao == 1) {
			System.out.println("\nAcertou em cheio pedindo um sanduíche hoje ein!");
			lanche = new Sanduiche();
			System.out.println("Agora só falta escolher os ingredientes....");
			menuSanduiche((Sanduiche) lanche); // casting 
		}
		
		if(opcao == 2) {
			System.out.println("Qual tipo de massa você vai pedir?");
			System.out.println("\t[1] Lasanha \n\t[2] Macarrão \n\t[3] Pizza \n");
			System.out.print("Informe aqui sua escolha: ");
			opcao = teclado.nextInt();
			
			while(opcao != 1 && opcao != 2 && opcao != 3) {
				System.out.println("Opção inválida!\n\n");
				System.out.println("\t[1] Lasanha \n\t[2] Macarrão \n\t[3] Pizza \n");
				System.out.print("Informe aqui sua escolha: ");
				opcao = teclado.nextInt();
				teclado.nextLine();
			}
			
			if(opcao == 1) {
				lanche = new Lasanha();
				System.out.println("\nAcertou em cheio pedindo uma lasanha hoje ein!");
				menuMassa((Lasanha) lanche);
			}
			
			if(opcao == 2) {
				lanche = new Macarrao();
				System.out.println("\nAcertou em cheio pedindo um macarrão hoje ein!");
				menuMassa((Macarrao) lanche);
			}
			
			if(opcao == 3) {
				lanche = new Pizza();
				System.out.println("\nAcertou em cheio pedindo uma pizza hoje ein!");
				menuMassa((Pizza) lanche);
			}
		
		}
		
		if(opcao == 3) {
			System.out.println("\nAcertou em cheio pedindo um bolo hoje ein!");
			lanche = new Bolo();
			System.out.println("Agora só falta escolher os ingredientes....");
			menuBolo((Bolo) lanche); // casting 
		}
		
	
	}
	
	public static void menuBolo(Bolo lanche) throws Exception {
		String massa;
		String recheio;
		String cobertura;
		
		System.out.println("Informe o sabor da massa: "); 
		massa = teclado.next();
		lanche.setMassa(massa);
		
		System.out.println("Informe o sabor do recheio: "); 
		recheio = teclado.next();
		lanche.setRecheio(recheio);
		
		System.out.println("Informe o sabor da cobertura: "); 
		cobertura = teclado.next();
		lanche.setCobertura(cobertura);
		
		System.out.println("\n\tPedido: " + lanche.toString() + "\n\n");
		System.out.println("Agora informe a distância em km até o local de entrega: "); 
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
		System.out.println(" 100%");
		TimeUnit.SECONDS.sleep(2);
		System.out.println("\n\tO pedido irá chegar em " + lanche.calculaTempoEntrega(distancia) + " minutos.\n");
		System.out.println("\tAgradecemos pela compra =)\n\n");
		System.out.println("\t ----------FINALIZADO----------");
	}
	
	public static void menuMassa(Massa lanche) throws Exception {
		String molho;
		
		System.out.println("Informe o sabor do molho: "); 
		molho = teclado.next();
		lanche.setMolho(molho);
		
		System.out.println("\n\tPedido: " + lanche.toString() + "\n\n");
		System.out.println("Agora informe a distância em km até o local de entrega: "); 
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
		System.out.println(" 100%");
		TimeUnit.SECONDS.sleep(2);
		System.out.println("\n\tO pedido irá chegar em " + lanche.calculaTempoEntrega(distancia) + " minutos.\n");
		System.out.println("\tAgradecemos pela compra =)\n\n");
		System.out.println("\t ----------FINALIZADO----------");
	}
	
	public static void menuSanduiche(Sanduiche lanche) throws Exception {
		String[] ingredientes = new String[10];
		int i = 0;
		
		 do {
			System.out.println("Informe o " + (i+1) + "º ingrediente ou aperte [0] para finalizar o pedido: "); 
			ingredientes[i] = teclado.next();
			
			if(ingredientes[0].equals("0")) {
				System.out.println("Você não informou nenhum ingrediente!");
				menuSanduiche((Sanduiche) lanche);
			}
			
			i++;
		} while(i < 10 && !ingredientes[i-1].equals("0"));
		 
		
		lanche.setIngredientes(ingredientes);
		System.out.println("\n\tPedido: " + lanche.toString() + "\n\n");
		
		System.out.println("Agora informe a distância em km até o local de entrega: "); 
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
		System.out.println(" 100%");
		TimeUnit.SECONDS.sleep(2);
		System.out.println("\n\tO pedido irá chegar em " + lanche.calculaTempoEntrega(distancia) + " minutos.\n");
		System.out.println("\tAgradecemos pela compra =)\n\n");
		System.out.println("\t ----------FINALIZADO----------");
	}
			
}

