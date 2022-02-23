package br.edu.insper.desagil.aula2;

public class Arvore {

	public String constroi(int n) {
		String arvore = "";
		for (int height = 0; height < n; height++) {
	        for (int spaces = n - height - 2; spaces >= 0; spaces--) {
	            arvore += " ";
	        }
	        for (int row = 0; row < height; row++) {
	            arvore += "/";
	        }
	        arvore += "|";
	        for (int row2 = 0; row2 < height; row2++)
	        {
	            arvore += "\\"; 
	        }
	        arvore += "\n";
	    }
		return arvore;
	}
}
