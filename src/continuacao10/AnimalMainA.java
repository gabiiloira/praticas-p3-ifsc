package continuacao10;

import exercicio10.Animal;

public class AnimalMainA{
	
	public static void main(String[] args) {
		
		Animal a = new Animal();
		
		a.nomecientifico = "Canis Lupus";
	    a.familia = "Canídeos";
	    a.reino = "Animal";
	    
	    System.out.println("O nome científico dos cachorros é "
				+ a.nomecientifico + " a família é " + a.familia + " e o seu reino é " + a.reino);
		System.out.println("========================================================================================="); 
	    
		a.nomecientifico = "Cricetinae";
	    a.familia = "Cricetídeos";
	    a.reino = "Animal";
	    
	    System.out.println("O nome científico dos hamsters é "
				+ a.nomecientifico + " a família é " + a.familia + " e o seu reino é " + a.reino);
		System.out.println("=========================================================================================");
		
		a.nomecientifico = "Ailuropoda melanoleuca";
	    a.familia = "Ursidae";
	    a.reino = "Animal";
	    
	    System.out.println("O nome científico dos pandas é "
				+ a.nomecientifico + " a família é " + a.familia + " e o seu reino é " + a.reino);
		System.out.println("=========================================================================================");
		
		a.nomecientifico = "Equus caballus";
	    a.familia = "Equinos";
	    a.reino = "Animal";
	    
	    System.out.println("O nome científico dos cavalos é "
				+ a.nomecientifico + " a família é " + a.familia + " e o seu reino é " + a.reino);
		System.out.println("=========================================================================================");
		
		a.nomecientifico = "Pisces";
	    a.familia = "Cyprinidae";
	    a.reino = "Animal";
	    
	    System.out.println("O nome científico dos peixes é "
				+ a.nomecientifico + " a família é " + a.familia + " e o seu reino é " + a.reino);
		System.out.println("========================================================================================="); 
	}
}