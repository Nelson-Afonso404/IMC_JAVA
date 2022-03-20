package ola.ucsal;

import java.util.Scanner;
import java.text.DecimalFormat;

public class CalcIMC {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		//declaring data type
		double altura,peso,res;
		System.out.println("digite seu peso e sua altura, respectivamente: ");
		peso = input.nextDouble();
		altura = input.nextDouble();
		res = peso/(altura*altura);
		//show the IMC and its rating
		System.out.println("Seu IMC é: " + formatador.format(res));
		if (res <= 18.5) {
			System.out.println("Abaixo do peso");
		} else if (res < 25) {
			System.out.println("Peso ideal");
		} else if (res < 30) {
			System.out.println("Levemente acima do peso");
		} else if (res < 35) {
			System.out.println("Obesidade grau 1 ");
		} else if (res < 40) {
			System.out.println("Obesidade grau 2 (severa) ");
		} else {
			System.out.println("Obesidade grau 3 (mórmida) ");
		}
		//closing the input
		input.close();
	}

}
