package ooavc;

public class Caixa extends Funcionario implements AcessoBancoInterno{
	int senha;

	public boolean verifica(int senha) {
		//metodo de verificacao da senha
		return false;
	}
	
	double getBonus() {
		return 0;
	}

}