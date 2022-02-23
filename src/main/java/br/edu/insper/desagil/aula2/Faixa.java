package br.edu.insper.desagil.aula2;

public class Faixa {

	public String calcula(int idade) {
		if (idade < 18) {
			return "jovem";
		}
		if (idade >= 18 && idade < 60) {
			return "adulto";
		}
		if (idade >= 60) {
			return "idoso";
		}
		return "";
	}
}
