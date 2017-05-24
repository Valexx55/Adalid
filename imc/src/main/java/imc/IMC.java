package imc;

import java.util.Scanner;

import com.google.gson.Gson;

public class IMC {

	public static void main(String[] args) {
		
		Persona persona = new Persona ("Héctor", 18, 56, 1.76);
		System.out.println(persona.getNombre());
		
		Gson gson = new Gson();
		String jsonpersona = gson.toJson(persona);
		
		System.out.println(jsonpersona);
		
		/*System.out.println("HOLA ADALID");
		// pedir peso
		System.out.println("DIME PESO (KG)");
		// leer el peso
		Scanner scanner = new Scanner(System.in);
		double peso = scanner.nextDouble();
		// pedir altura
		System.out.println("DIME ALTURA (M)");
		double altura = scanner.nextDouble();
		// calcular el imc
		double imc = peso / (altura * altura);

		System.out.println("IMC = " + imc);

		if (imc < 16) {
			System.out.println("DESNUTRIDO");
		} else if (imc >= 16 && imc < 18) {
			System.out.println("BAJOPESO");
			*/
		}
		/*
		float mifloat = 1.0f;
		double midouble = 1.5d;
		
		byte mibyte;*/
		

	
}
