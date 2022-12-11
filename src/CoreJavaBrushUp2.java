import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushUp2 {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,4,5,6,7,8,9,10,122};
		
		// Mostrar numeros divisibles por 2 (numeros pares)
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i] % 2 == 0)
			{
				System.out.println(arr[i]);
			}
			else
			{
				System.out.println(arr[i] + " is not muptiple of 2");
			}
			
		}
		
		// Similar a array. Tiene ventaja de tener métodos útiles (contains,...)
		ArrayList<String> a = new ArrayList<String>();
		a.add("Marc");
		a.add("Borruey");
		a.add("Hoyos");
		
		System.out.println(a.get(2)); // Devuelve la posición 2
		
		for( int i = 0; i < a.size(); i++) {
			
			System.out.println(a.get(i));
			
		}
		
		System.out.println("***************");
		
		for ( String val : a) {
			
			System.out.println(val);
			
		}
		
		System.out.println(a.contains("Marc")); // devuelve boolean, busca lo que le indicamos
		
		// Convertir un array en una array list
		String[] name = { "rahul", "shetty", "selenium" };
		List<String> nameArrayList = Arrays.asList(name);
		nameArrayList.contains("selenium"); // como ahora name es una arraylist, podemos usar contains
		
		
	}

}
