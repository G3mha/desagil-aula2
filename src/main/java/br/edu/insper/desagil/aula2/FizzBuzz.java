package br.edu.insper.desagil.aula2;

public class FizzBuzz {

	public String calcula(int n) {
		String a = Integer.toString(n);
		if (n % 3 == 0) {
			a = "Fizz";
		}
		if (n % 5 == 0) {
			a += "Buzz";
		}
		return a;
	}
}
