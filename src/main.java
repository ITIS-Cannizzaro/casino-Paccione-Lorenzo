import java.util.Scanner;

public class main {
	public class Main {
		public static void main(String[]args){

	        dado d=new dado();

	        ContoGiocatore G1=new ContoGiocatore();

	        ContoCasino C1=new ContoCasino();

	        System.out.println("benvenuti'");

	        String risposta="si";

	        Scanner in = new Scanner(System.in);

	        Scanner in1 = new Scanner(System.in);

	        while (risposta.equals("si")) {

	            System.out.println("numero: ");
	            int numero = in.nextInt();

	            if(numero>0 && numero<7){

	                System.out.println("importo giocata: ");
	                int giocata = in1.nextInt();

	                double ContoGiocatore = G1.getContoGiocatore();

	                double ContoCasinò = C1.getContoCasinò();

	                double ContoCasinò1 = ContoCasinò/5;

	                if (giocata <= ContoGiocatore && giocata <= ContoCasinò1) {

	                    System.out.println("Lancio il dado");

	                    int lancio = d.lancia();

	                    System.out.print("Il risulatato è: "+lancio);

	                    if (lancio==numero){

	                        System.out.println("hai vinto");

	                        G1.vincita(giocata);

	                        C1.perdita(giocata);
	                    }
	                    else{

	                        System.out.println("hai perso");

	                        G1.perdita(giocata);

	                        C1.vincita(giocata);
	                    }
	                }
	                else{

	                    System.out.println("Non puoi puntare quella somma");

	                }

	                double newImporto = G1.getContoGiocatore();

	                System.out.print("Il tuo conto è pari a :  ");

	                System.out.println(G1.getContoGiocatore());

	                if (newImporto>0) {

	                    System.out.println("Vuoi continuare?");

	                    risposta = in.next();

	                }

	                else{

	                    System.out.println("Conto esaurito");

	                    System.out.println(G1.getContoGiocatore());

	                    risposta="no";
	                }
	            }
	        }
		}
	}
}
	


