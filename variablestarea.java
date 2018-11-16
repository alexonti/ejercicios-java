package variables;

import java.util.*;

public class variablestarea {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// declaracion de variables;
		
			double a=22.52611681;
			double b=1.64688631;
			
			
			//double max=Math.max(a, b);// devuelve el valor máximo entre 2 variables
			//System.out.println(max);
			
			//double min=Math.min(a, b); // devuelve el valor mínimo entre 2 variables
			//System.out.println(min);
			
			//double abs=Math.abs(a); // devuelve el valor absoluto de la variable a
			//System.out.println(abs);
			
			//double cubo=Math.cbrt(a);// devuelve la raiz cúbica de la variable a
			//System.out.println(cubo);
			
			//double coseno=Math.cos(b);// devuelve el coseno trigonométrico de la variable b
			//System.out.println(coseno);
			
			//double seno=Math.sin(b);// devuelve el seno trigonométrico de la variable b
			//System.out.println(seno);
			
			//double tangente=Math.tan(b);// devuelve el coseno trigonométrico de la variable b
			//System.out.println(tangente);
			
			//double exponente=Math.exp(a);// devuelve "e" elevado al valor de la variable a
			//System.out.println(exponente);
			
			//double expmenos1=Math.expm1(a);// devuelve "e" elevado al valor de la variable a, menos 1
			//System.out.println(expmenos1);
			
			//double hipotenusa=Math.hypot(a, b);// devuelve la hipotenusa dadas 2 variables (hypot= (x.x+y.y))
			//System.out.println(hipotenusa);
			
			//double log=Math.log(a);// devuelve el logaritmo natural base e de la variable a
			//System.out.println(log);
			
			//double log10=Math.log10(a);// devuelve el logaritmo base 10 de la variable a
			//System.out.println(log10);
			
			//double azar=Math.random();// devuelve un valor  double aleatorio
			//System.out.println(azar);
			
			//double radianes=Math.toRadians(a);// Convierte un ángulo medido en grados a al equivalente de un ángulo medido en radianes de la variable a
			//System.out.println(radianes);
			
			//double degrees=Math.toDegrees(b);// Convierte un ángulo medido en radianes a al equivalente de un ángulo medido en grados de la variable b
			//System.out.println(degrees);
			
			// Casting= Asignaciòn a variables distintas a las declaradas
			
			//System.out.println("El tipo de dato utilizado es de tipo double y tiene valor: 222.52611681");
			
			//System.out.println((int)max);
			//System.out.println((float)max);
			//System.out.println((short)max);
			//System.out.println((long)max);
			//System.out.printf("%.2f", (float)a);
			
			
			
			// Clases que no estàn predeterminadas
			
			Scanner entrada=new Scanner(System.in);
			
			//System.out.println("Ingrese el texto:");
			//String dato_texto=entrada.nextLine();
			//System.out.println("dato texto ingresado: "+dato_texto);
			
			//System.out.println("Ingrese un entero:");
			//int dato_int=entrada.nextInt();
			//System.out.println("dato entero ingresado: "+dato_int);
			
			//Manejo de string
			
			//String nombre1=new String("hola");
			//String nombre2=new String("alexonti@hotmail.com");
			
			//String nombre3="hola";
			//String nombre4="alexonti@hotmail.com";
			
			//System.out.println(nombre1);
			//System.out.println(nombre1.equals(nombre2));
			//System.out.println(nombre2.equals(nombre3));

			//System.out.println(nombre1.length());
			//ystem.out.println(nombre1.toUpperCase());
			//System.out.println(nombre1.contains("@"));
			//System.out.println(nombre2.contains("@"));
			
			
			String a1= " Victoria 1";
			String a2= " Kim ";
			String a3= " Cachito ";
			
			
		System.out.println(a1.compareTo(a2));  //compara 2 cadenas lexicograficamente
		System.out.println(a1.concat(a2));  //concatena 2 strings
		System.out.println(a3.endsWith("to"));  //prueba si el string termina con determinado sufijo
		System.out.println(a2.getBytes()); // codifica esta cadena en una secuencia de bytes usando los caracteres por defecto de la plataforma, guardando el resultado en un arreglo de bytes
		System.out.println(a1.hashCode()); // devuelve un codigo hash para la cadena
		System.out.println(a2.intern()); // devuelve una representacion canònica para el objeto de la cadena
		System.out.println(a3.isEmpty());  //devuelve verdadero, si y solo si, lenght=0;
		System.out.println(a3.startsWith("C")); // prueba si el string comienza con un determinado prefijo
		System.out.println(a1.toCharArray());  // convierte el string een un nuevo caracter de un arreglo
		System.out.println(a2.toLowerCase()); // convierte todos lo caracteres a minùsculas siguiendo las reglas locales
		System.out.println(a1.toString());  // el objeto el cual es una cadena, es devuelto a si mismo
		System.out.println(a1.trim()); // devuelve una copia de la cadena con el espacio inicial y final omitido
		System.out.println(a1.valueOf(a3));  // intercambia la informaciòn del string dado por el argumentado
		System.out.println(a1.replace("i", "x")); // remplaza un caracter en el string por otro caracter
		System.out.println(a1.equalsIgnoreCase(a3)); // compara 2 string ingnorando las consideraciones de minusculas
		
		
		
		
		
		
		
		
		
			

			
			

			
			
			
			
			
	}

}
