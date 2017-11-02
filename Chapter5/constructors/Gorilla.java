package constructors;

public class Gorilla extends Animal{
	public Gorilla(int age) {
		super(age, "Gorilla");
	}

	public Gorilla(String i) {
		super(5);  // si no hay un default constructor en el padre es necesario
				   // cada constructor del hijo debe tener una llamada al padre
	}
	
//	public Gorilla() {
//		
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
