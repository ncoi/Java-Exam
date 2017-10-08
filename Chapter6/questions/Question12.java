package questions;

import java.io.IOException;

public class Question12 {
	public String name;
	public void run() throws StackOverflowError{
		System.out.print("1");
		try {
			System.out.print("2");
			name.toString();
			System.out.print("3");
		} catch (NullPointerException e) {
			System.out.print("4");
			throw e;
		} finally {
			System.out.print("5");	
		}
		}
		public static void main(String[] args) {
			Question12 jerry = new Question12();
			jerry.run();
			System.out.print("6");
		
		}
		public static void hola() throws IOException{
			
		}
}
