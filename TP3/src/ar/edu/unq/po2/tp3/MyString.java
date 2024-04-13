package ar.edu.unq.po2.tp3;

//----------------------------------------
	//E4

public class MyString{
	public static void myString(String[] word){
		String a = "abc";
		String s = a;
		String t;
		
		
		// s.length();
        int lengthS = s.length();
        System.out.println(lengthS);

        
        // a.toUpperCase();
        String upperA = a.toUpperCase();
        System.out.println(upperA);

        // "Libertad".indexOf("r");
        int indexR = "Libertad".indexOf("r");
        System.out.println(indexR);

        // "Universidad".lastIndexOf('i');
        int lastIndexI = "Universidad".lastIndexOf('i');
        System.out.println(lastIndexI);

        // "Quilmes".substring(2,4);
        String subQuilmes = "Quilmes".substring(2, 4);
        System.out.println(subQuilmes);

        // (a.length() + a).startsWith("a");
        boolean startsWithA = (a.length() + a).startsWith("a");
        System.out.println(startsWithA);

        // s == a;
        boolean equalsSAndA = s == a;
        System.out.println(equalsSAndA);

        // a.substring(1,3).equals("bc")
        boolean equalsSubAAndBc = a.substring(1, 3).equals("bc");
        System.out.println(equalsSubAAndBc);
        
        
        
        
        

	}

}


//----------------------------------------
	//E5
/*
1. ¿Qué son los tipos de datos primitivos?

	-Los tipos de datos primitivos, son aquellos tipos que provienen incluidos en el ambiente sin necesidad
	de tener que crear un tipo de representacion o metodos para que estos funcionen correctamente.
 	-Se representan con mayusculas
  
2. ¿Cuál es la diferencia entre un int y un Integer? 
	int:
	-Es un tipo de dato primitivo en Java que representa un número entero de 32 bits.
	-Se utiliza para almacenar valores enteros directamente en la memoria. -> principal diferencia
	-No es un objeto y no tiene métodos asociados.
		
	Integer:
	-Integer es una clase de envoltura (wrapper class) en Java que encapsula un valor entero de tipo int en un objeto.
	-Es un objeto y puede almacenarse en el heap.
	-Proporciona métodos útiles para operar con valores enteros.
	
	int numero = 10;
	Integer numero = 10;
	
	Diferencias:
	-En donde se almacena el dato, el int en la memoria directamente y el Integer en la heap
	-int no posee clase porque es primitivo e Integer si -> "creado"


3.¿Si se define una variable de instancia de tipo int cual sería su valor predeterminado? ¿Y si se
define una de tipo Integer? Haga la prueba en Eclipse.
	int -> 0
	Integer -> null
		// Imprimir TIPO INT
        System.out.println("Valor predeterminado de intValue: " + obj.intValue);
        
        // Imprimir TIPO INTEGER
        System.out.println("Valor predeterminado de integerValue: " + obj.integerValue);
	
		
4. Responder la pregunta del punto anterior (3), pero ahora en lugar de definir una variable de
instancia se define una variable de método.
	

		// Imprimir el valor predeterminado de la variable de método de tipo int
        System.out.println("Valor predeterminado de intValue: " + intValue);
        
        // Imprimir el valor predeterminado de la variable de método de tipo Integer
        System.out.println("Valor predeterminado de integerValue: " + integerValue);	

 * 
 * 
 * 
 * 
 * */
	

