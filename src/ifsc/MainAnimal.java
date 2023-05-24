package ifsc;

import java.util.ArrayList;

public class MainAnimal {

	public static void main(String[] args) {
		
		ArrayList<Animal> animais = new ArrayList<>();
		
		Animal cachorro = new Animal();
		cachorro.setNome("Xuxa");
		cachorro.setRaca("Vira-Lata");
		cachorro.setComprimento(60.00f);
		cachorro.setNumpatas(4);
		cachorro.setCor("Cinza");
		cachorro.setEcossis("Casa");
		
		animais.add(cachorro);
		
		Animal gato = new Animal();
		gato.setNome("Batman");
		gato.setRaca("Chartreux");
		gato.setComprimento(40.00f);
		gato.setNumpatas(4);
		gato.setCor("Preto");
		gato.setEcossis("Casa");
		
		animais.add(gato);
		
		for (Animal animal : animais) {
			System.out.println(animal.getNome());
			System.out.println(animal.getRaca());
			System.out.println(animal.getComprimento());
			System.out.println(animal.getNumpatas());
			System.out.println(animal.getCor());
			System.out.println(animal.getEcossis());
	}
		}
	}