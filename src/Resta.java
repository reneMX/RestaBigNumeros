import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Date;
import java.text.*;

/*
 * Lunes a las 14:30, se realizo durante 2hrs.
 * Miercoles, 18:03 a 20:40
 * Viernes 12pm aprox.  a 12 am 
 * Tiempo Total 16 hrs, aproximadamente
 * */

public class Resta {
	
	

	
	public Resta() {

	}
	public int[] toArray(String operando) {
		int indiceA = 0;
		int arrOperandoA[] = new int[operando.length()];
		
		for ( char valor: operando.toCharArray() ) {
			arrOperandoA[indiceA] = Integer.valueOf(valor) - 48 ;
			indiceA++;
		}
		return arrOperandoA;
	}
	public void printArray(int array[]) {
		for(int x : array){
		      System.out.print(x);
		  }
		System.out.print("\n");
	}
	public int getTam(int arrOperandoA[],int arrOperandoB[]) {
		int tam;
		if(arrOperandoA.length > arrOperandoB.length ) {
			tam = arrOperandoA.length; 
			}else {tam = arrOperandoB.length;}
		return tam;
	}
	public int[] Resta(int tam, int[] arrOperandoA, int[] arrOperandoB) {
		int resultado[]  = new int[tam];
		boolean prestado = false;
		boolean acarreo  = false;
        
        
        
        for(int i = tam-1; i >=0 ; i--)
        {
            if(prestado)
            {
            	prestado = false;
            	arrOperandoB[i]+=1;
            }
            acarreo =! (arrOperandoA[i] > arrOperandoB[i]) &&  arrOperandoA[i] != arrOperandoB[i];
            if(acarreo)
            {
            	prestado = true;
            	arrOperandoA[i]+=10;
            }
            resultado[i]=arrOperandoA[i]-arrOperandoB[i];
        }
        return resultado;
	}
	public void printRest(int[] resultado) {
		System.out.println("El resultado  es: ");
        for (int i = 0; i < resultado.length; i++){
            System.out.print(resultado[i]);
        }
        System.out.println("\n");
	}
	public static void main(String[] args)
	{
		Resta resta 	= new Resta();
		
		Scanner entrada 	= new Scanner(System.in);
		String operandoA 	= "182";
		String operandoB 	= "100";
		
		System.out.println("Ingresa tu primer Operando: ");
		operandoA = entrada.next();
		
		System.out.println("Ingresa tu segundo Operando: ");
		operandoB = entrada.next();
		/* Delcaraciones*/
		
		
		int arrOperandoA[] = new int[operandoA.length()];
		int arrOperandoB[] = new int[operandoB.length()];
		
		
		String val;
		int b = 0;
		int tam;
		
		
		
		/* Mostramos los numeros en crudo*/
		System.out.println("OperandoA: "  + operandoA);
		System.out.println("OperandoB: "  + operandoB);
	
		/* Convertimos cada numero a array de int */
		
		arrOperandoA = resta.toArray(operandoA);
		arrOperandoB = resta.toArray(operandoB);
		
		/* Mostramos la conversion */
		resta.printArray(arrOperandoA);
		resta.printArray(arrOperandoB);
		
		/* Obtenemos el tamanio del numero mas grande */
		tam = resta.getTam(arrOperandoA, arrOperandoB);
		
		/* Creamos un array para el resultado */
		int resultado[] = new int[tam];
		
		/* Hacemos la resta*/
		resultado = resta.Resta(tam,arrOperandoA, arrOperandoB);
		
		/* Mostramos la resta */
		resta.printRest(resultado);
  		
	}	
	
	
	
	
	/*
	 * OPERANDOS EJEMPLOS PARA INGRESAR
	 * 
	 * OperandoA
	 * 
	 *  999567730000000000000056454210032311316790023457157000000000000346648646784000000000064621214565587864564
		12456773000000000000005645421003231131679794649874834664864670000000000846462121456550000000000878640023
		6456454210032311310000000000679794649870000000000487946498748346648640000000000678464621214565587864
		54210032311310000000000679794649870000000000487946498748346648640000000000678464621214565587864
		999567730000000000000056454210032311316790023457157000000000000346648646784121211156564621214565587
		86456454210032311319562111010679794649879995841273487946498748000008643333456550678464621214565587864
		999567730000000000000056454210032311316790023457157000000000000346648646784000000000064621214565587864
		56454210032311310000000000679794649870000000000487946498748346648640000000000678464621214565587864
		999567730000000000000056454210032311316790023457157000000000000346648646784000000000064621214565587864
		56454210032311310000000000679794649870000000000487946498748346648640000000000678464621214565587864
                         
       **OperandoB
       *
	 *  86456454210032311319562111010679794649879995841273487946498748000008643333456550678464621214565587864
        6456454210032311314884745613679794649879992245710487946498748346648640000000000678464621214565587864
        86456454210032311313217896540679794649875825149674487946498748346648646548127896678464621214565587864
        645645421003231131488474561367979464987999224571048794649874834664864000000000067846462121456558786464
        99956773000000000000005645421003231131679002345715765984712483466486467846663232115646212145655878
        999567730000000000000056454210032311316790023457157000000000000346648646784000000000064621214565587864
        12456773000000000000005645421003231131679794649874834664864670000000000846462121456550000000000878640023
        4571574586235971346648646700000000008464621214565580000000000786456454210032311316797946498748
        56454210032311314976853159679794649879865274891487946498748346648640000000000678464621214565587864
        56454210032311311593574859679794649876565987412148599487946498748346648640000000000678464621214565587864
         
	 * */
		
	
}
