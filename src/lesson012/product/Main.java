package lesson012.product;

public class Main {

	public static void main(String[] args) {
		Product product1 = new Product();
		
		product1.setIsim("Asus");
		System.out.println(product1.getIsim());
		
		System.out.println("---------------------");
		
		product1.isimGuncelle("HP");
		System.out.println(product1.getIsim());
		
		System.out.println("---------------------");
		
		product1.veritabaninaKaydet();
		
		System.out.println("-------------------------");
		
		System.out.println(product1);

	}

}
