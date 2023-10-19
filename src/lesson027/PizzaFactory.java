package lesson027;

public class PizzaFactory {
	public static Pizza builder(EPizzaTur tur, EBoyut boyut, EHamurTip tip) {
		switch (tur) {
		case SUCUKLUJANBONLU: return new KarisikPizza(tur,boyut,tip);
		case TAVUKLU,MANTARLI: return new KlasikPizza(tur,boyut,tip);	
		default: throw new RuntimeException("");
		
		}
		
	}
}
