package lesson023;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Manager{
	
	List<Ogrenci> ogrenciList = new ArrayList<Ogrenci>();
	
	public void ogrenciListesiOlustur() {
		try(Scanner sc = new Scanner(new FileReader("Ogrenciler.txt"))){
			while (sc.hasNext()) {
				String satir = sc.nextLine();
				String[] dizi = satir.split(",");
				Ogrenci ogrenci = new Ogrenci(dizi[0]);
				//ogrenciList.add(ogrenci);
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}
	
	public void ortHesapla() {
		
		try(Scanner sc = new Scanner(new FileReader("Ogrenciler.txt"))){
			while (sc.hasNext()) {
				String satir = sc.nextLine();
				String[] dizi = satir.split(",");
				double ort = ortalamaHesaplaWithStream(dizi);
				Ogrenci ogrenci = new Ogrenci(dizi[0],ort);
				ogrenciList.add(ogrenci);
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		System.out.println(ogrenciList);
	}
	
	private double ortalamaHesapla(String[] dizi) {
		int toplam = 0;
		double ortalama;
		for (int i = 1; i < dizi.length; i++) {
			toplam+=Integer.parseInt(dizi[i]);
		}
		ortalama = toplam / (dizi.length-1);
		return ortalama;
	}
	
	private double ortalamaHesaplaWithStream(String[] dizi) {
		return Arrays.stream(dizi).skip(1).mapToDouble(Double::parseDouble).average().orElse(0);
	}
	public void dosyayaYaz() {
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Ogrenciler2.txt"))){
			oos.writeObject(ogrenciList);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	public void dosyayaYaz2() {
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Ogrenciler2.txt"))){
			ogrenciList.forEach(o->{
				try {
					oos.writeObject(o);
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			});
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	public void dosyadanOku(String fileName) {
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))){
			ArrayList<Ogrenci> okunanList = (ArrayList<Ogrenci>) ois.readObject();
			
			for (Ogrenci ogrenci : okunanList) {
				System.out.println(ogrenci);
			}
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	}
	public void dosyadanOku2(String fileName) {
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))){
			ArrayList<Ogrenci> okunanList;
			while (true) {
				okunanList = (ArrayList<Ogrenci>) ois.readObject();
				System.out.println(okunanList);
			}
			
		}catch (EOFException e) {
			// TODO: handle exception
		}
		catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	}
	
}
