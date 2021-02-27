import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Date;
import java.text.*;

public class Resta {
	

	public static void main(String[] args)
	{
		

		/* Delcaraciones*/
		String operandoA = "182";
		String operandoB = "90";
		
		String val;
		int b = 0;
		
		
		/* Mostramos los numeros en crudo*/
		System.out.println("OperandoA: "  + operandoA);
		System.out.println("OperandoB: "  + operandoB);
		
		
		
		
		// Convertimos de cadena Binario //
		
		 for (int i = 0 ; i < operandoA.length() ; i++){
		      b 	= operandoA.charAt(i);
		      val 	=Integer.toBinaryString(b);
		      System.out.println(operandoA.charAt(i));
		      System.out.println(val+"\n");
		      }
		   }
		
		/* Convertimos cada numero a array de int */
		
//		int arrOperandoA[] = new int[operandoA.length()];
//		int arrOperandoB[] = new int[operandoB.length()];
		
//		int indiceA = 0;
//		int indiceB = 0;
		
		
//		for ( char valor: operandoA.toCharArray() ) {
//			arrOperandoA[indiceA] = Integer.valueOf(valor) - 48 ;
//			indiceA++;
//		}
		
		
//		for(int x : arrOperandoA){
//		      System.out.println("valor: "+x);
//		  }

		
		
//		System.out.println();
		
		
		
		
		
		
		
		
		
		
//		
//		String operandoA = "37";
//		String operandoB = "1523";
//		String Binario	 = "";
//		String aux 		 = " ";
//		
//		byte b;
//		byte[] bytesA = operandoA.getBytes();
//		byte[] bytesB = operandoB.getBytes();
//		byte[] resta  = aux.getBytes();
//		
//		int cero 		= 0 ;
//		int binario1 	= 0 ;
//		int binario2	= 0 ;
		
		
		/* Operando A */
//		System.out.println("String: " + operandoA);
//		System.out.println("Bytes: "  + Arrays.toString(bytesA));
		
		/* Operando B */
//		System.out.println("String: " + operandoB);
//		System.out.println("Bytes: "  + Arrays.toString(bytesB));
//		
//		int k = 0;
//		int j = bytesA.length ;
//		for(int i = 0 ; i <  bytesA.length; i++){
//			resta[k] = (byte) (bytesB[i] - bytesA[j]);
//			j--;
//			k++;
//			System.out.println("Binario 1: " + operandoA[i]);
//		}
		
//		for(int w = 0; w < resta.length; w++ ){
//			System.out.println("Resta: " + resta[w]);
//		}
		
		
		
		
		
		
//		for(int i = 0; i < operandoB.length(); i++)
//		{
//			cero =  operandoB.charAt(i);
//			
//			aux  = Integer.toBinaryString(cero);
//			System.out.println(cero);
//			System.out.println(aux);
			/*hacemos la suma binaria*/
//			binario1 = binario1 + Integer.parseInt(aux,2);
//			System.out.println(binario1);
//			Binario = Binario + " " +aux;
			/*Convertimos de binario a decimal*/
//			System.out.println("Resultado: " + Integer.toString(binario1,2));
//			System.out.println();
			
//		}
//		System.out.println("numbinario:"+Binario);
		
//		System.out.println("Resultado: " + Integer.toString(binario1,2));
		
		
//		for(int i = 0; i < operandoA.length(); i++) {
//			cero =  operandoA.charAt(i);
//			aux = Integer.toBinaryString(cero);
//			System.out.println(operandoA.charAt(i));
//			System.out.println(cero);
//			System.out.println(aux);
//		}
		
	}	
		
