package com.javabasics;

public class ConditionalStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 * SWITCH CASE
		 */
		
		int temperatura = 22;
		
		switch (temperatura) {
		case 10:
			
			System.out.println("Frío");
			break;

		case 20:
			System.out.println("Agradable");
			break;
			
		case 30:
			System.out.println("Calor");
			break;
			
		case 40:
			System.out.println("Estamos en el desierto");
			break;
			
		default:
		System.out.println("Da igual");
		break;
			
		}
		
		
		
	}

}
