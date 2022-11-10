package aula;

public class Exemplo {
	public static void SayHelloManyTimes(int times) {
		for (int i=0; i < times; i++) {
			SayHello();
		}
	}
	
	public static void SayHello() {
		System.out.println("Olá, mundo!");
	}
	
	public static void main(String[] args) {
		SayHelloManyTimes(5);	
	}
}
