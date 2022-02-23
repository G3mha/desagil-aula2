package br.edu.insper.desagil.aula2;

public class Tabuada {

	public String constroi(int n) {
		String tabuada = "";
		for (int i = 1; i <= n; i++) {
			for (int k = 1; k <= n; k++) {
				tabuada = tabuada + (i * k) + " ";
			}
			tabuada = tabuada + "\n";
		}
		return tabuada;
	}
}
