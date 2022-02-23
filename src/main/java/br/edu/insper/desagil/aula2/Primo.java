package br.edu.insper.desagil.aula2;

public class Primo {

	public int conta(int limite) {
		int primo = 0;
		for (int i = 2; i <= limite; i++) {
		  boolean tem_primo = true;
		  for (int x = 2; x < i; x++) {
			  if (i % x == 0) {
				  tem_primo = false;
			  }
		  }
		  if (tem_primo == true) {
			  primo++;
		  }
		}
		return primo;
	}
}
