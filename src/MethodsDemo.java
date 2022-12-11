
public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodsDemo d = new MethodsDemo();
		d.getData();
		String name = d.getDataReturn();
		System.out.println(name);
		
		MethodsDemo2 d1 = new MethodsDemo2();
		d1.getUserData();
		
		// Al ser static, no hace falta instanciar el objeto (new...) y se puede usar directamente
		System.out.println(getDataReturnStatic());
		
	}
	
	// void no devuelve nada. Sólo ejecuta el código de dentro
	public void getData() {
		
		System.out.println("hello world");
		
	}
	
	// Cuando si devuelve algo, hay que indicar el tipo de lo que devuelve
	public String getDataReturn() {
		
		return "Marc Borruey";
		
	}
	
	// Si es static no hace falta instanciar el objeto. Se llama directamente
	public static String getDataReturnStatic() {
		
		return "Marc Borruey";
		
	}

}
