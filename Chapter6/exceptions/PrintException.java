package exceptions;

import java.io.IOException;

public class PrintException {
	private static void hop() {
		throw new RuntimeException("cannot hop");
	}
	public void ohNo() throws IOException{
		
	}
	public static void main(String[] args) {
		try {
			hop();
		} catch(Exception e) {
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
