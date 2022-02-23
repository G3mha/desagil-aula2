package br.edu.insper.desagil.aula2;

public class Calculadora {

	public double executa(int a, int b, char op) {
		double soma;
		double aa = a;
		double bb = b;
		if (op == '*') {
			soma = aa * bb;
			return soma;
		}
		else if (op == '+') {
			soma = aa + bb;
			return soma; 
		}
		else if (op == '-') {
			soma = aa - bb;
			return soma;
		}
		else if (op == '/') {
			if (b == 0) {
				return 0.0;
			}
			soma = aa / bb;
			return soma; 
		}
		return 0.0;
	}
}
