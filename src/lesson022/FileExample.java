package lesson022;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class FileExample {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		// yapımız switchcase
		//1- Dosya yarat 
		//eğer dosya oluşmuşsa hata fırlatalım "File Already exist" 
		
		
		menu();
		
	}
	
	public static void menu() {
		
		while (true) {
			System.out.println("İşlem girin");
			System.out.println("1- Dosya oluştur");
			System.out.println("2- Dosya Metin Ekle");
			System.out.println("3- Dosyayı oku");
			
			int secim = sc.nextInt();
			sc.nextLine();
			switch (secim) {
			case 1:
				File file = dosyaAdiniBelirle();
				dosyaOlustur(file);
				break;
			case 2:
				metinEkle();
				break;
			case 3:
				dosyaOku();
				break;
				/*
			case 1:
				dosyaOlustur(ConstantFile.file);
				break;
			*/
			default:
				System.err.println("geçersiz ");
				break;
			}
		}
	}
	
	//kullanıcı istediği dosyaya bişeyler eklesin
	//hangi dosyaya yazmak istiyosunuz 
	//deneme
	private static void metinEkle() {
		File file = dosyaAdiniBelirle();
		
		try(BufferedWriter writer = new BufferedWriter(new FileWriter(file,true))){
			System.out.println("Metin giriniz");
			String text = sc.nextLine();
			writer.write(text + "\n");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

	//dosya adına kullanıcı karar vercek
	public static void dosyaOlustur(File file) {

		try {
			if(file.createNewFile()) {
				System.out.println("Dosya Oluşturuldu " +file.getName());
			}else {
				throw new IOException("Fİle Alredy Exist!");
			}
		} catch (IOException e) {
			System.out.println("Hata --> "+e.getMessage());
		}
	}
	
	public static File dosyaAdiniBelirle() {
		//kullanıcı sadece dosya ismini girsin (isminni sonuna .txt yazmasın)
		//bunu biz oluşturcaz
		//input --> deneme
		//output --> File --> ismin deneme.txt
		System.out.println("Dosya adınızı girin");
		String dosyadi = sc.nextLine();
		
		String dosyaYolu = dosyadi + ".txt";
		File file = new File(dosyaYolu);
		return file;
	}
	
	public static void dosyaOku() {
		System.out.println("okumak istediğiniz Dosya adını giriniz");
		String dosyaAd = sc.nextLine();
		
		dosyaAd+=".txt";
		
		try(BufferedReader reader = new BufferedReader(new FileReader(dosyaAd))){
			String satir;
			while (reader.readLine()!=null) {
				satir = reader.readLine().trim();
				System.out.println(satir);
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	/*
	private static File selectFile() {
		Path path = Path.of(System.getProperty("user.dir"));
		try {
			List<Path> paths = Files.list(path).collect(Collectors.toList());
			paths.forEach(f -> System.out.println(f.getFileName()));
			System.out.println("Hangi dosyaya yazmak istiyosunuz");
			int secim = scanner.nextInt();
			scanner.nextLine();
			return new File(paths.get(secim).toUri());
		} catch (Exception e) {
			return null;
		}
	}
	*/
}