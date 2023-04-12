package ifsccontinuacao;

import ifsc.Veiculo;

public class MainVeiculo {

	public static void main(String[] args) {
		
		Veiculo v1 = new Veiculo();
		v1.setNome("Corolla");
		v1.setAno(2013);
		v1.setNumRodas(4);
		v1.setFabricante("Toyota");
		v1.setCor("Prata");
		
		Veiculo v2 = new Veiculo();
		v2.setNome("Saveiro");
		v2.setAno(2016);
		v2.setNumRodas(4);
		v2.setFabricante("Volkswagen");
		v2.setCor("Preta");
		
		Veiculo v3 = new Veiculo();
		v3.setNome("Compass");
		v3.setAno(2022);
		v3.setNumRodas(4);
		v3.setFabricante("Jeep");
		v3.setCor("Branco");
	}
}

