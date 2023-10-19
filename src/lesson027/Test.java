package lesson027;

import java.util.Scanner;

public class Test {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		Pizza pizza = pizzaOlustur();	
		System.out.println("Pizzanız --> " + pizza.getBoyut() + " boy " + pizza.getTip() + " hamurlu " + pizza.getTur() + " pizzadır.");
		
	}
	
	public static EPizzaTur turAl() {
		System.out.println("Pizza Türlerimiz Aşağıda.");
		for (EPizzaTur tur : EPizzaTur.values()) {
			System.out.println("-" + tur);
		}
		
		System.out.println("Hangi tür pizza istiyorsunuz ? ");
		String turValue = sc.nextLine();
		EPizzaTur tur = EPizzaTur.valueOf(turValue.toUpperCase());
		return tur;
	}
	
	public static EBoyut boyutAl() {
		System.out.println("Seçebileceğiniz boyutlar..");
		for (EBoyut boyut : EBoyut.values()) {
			System.out.println("-" + boyut);
		}
		
		System.out.println("Hangi boyut istiyorsunuz ?  ");
		String boyutValue = sc.nextLine();
		EBoyut boyut = EBoyut.valueOf(boyutValue.toUpperCase());
		return boyut;
	}
	
	public static EHamurTip tipAl() {
		System.out.println("Hamur tipleri aşağıda..");
		for (EHamurTip tip : EHamurTip.values()) {
			System.out.println("-" + tip);
		}
		
		System.out.println("Hangi hamur tipi olsun ? ");
		String tipValue = sc.nextLine();
		EHamurTip tip = EHamurTip.valueOf(tipValue.toUpperCase());
		return tip;
	}
	
	public static Pizza pizzaOlustur() {

		Pizza pizza = PizzaFactory.builder(turAl(), boyutAl(), tipAl());
		return pizza;
	}
}
