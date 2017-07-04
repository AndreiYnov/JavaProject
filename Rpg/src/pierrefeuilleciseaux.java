//Ceci importe la classe Scanner du package java.util
import java.util.Scanner; 

public class pierrefeuilleciseaux {

	private static Scanner sc;

	public static void main(String[] args) {
	    {
	            //Annonce du début  
	           System.out.println("Jeu de pierre feuille ciseau" );
	             
	           sc = new Scanner(System.in);
	           System.out.println("Veuillez saisir un mot :");
	           String str = sc.nextLine();
	           System.out.println("Vous avez saisi : " + str);
	}
}	    
}
