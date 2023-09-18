package lesson016;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class QueueOrnek {

	public static void main(String[] args) {
		Queue<String> isimler = new LinkedList<>();
		
		Random rnd = new Random();
		
		int randomSayi = rnd.nextInt(10);
		System.out.println("Hediye cek sayisi: " + randomSayi);
		
		isimler.offer("mehmet");
		isimler.offer("ahmet");
		isimler.offer("baris");
		isimler.offer("berkin");
		isimler.offer("emre");
		isimler.offer("akin");
		isimler.offer("melih");
		isimler.offer("ali");
		isimler.offer("atahan");
		isimler.offer("bahadir");
		
		
		for (int i = 0; i < randomSayi; i++) {
			System.out.println(isimler.poll() + " hediye cekini aldi.");
		}
		isimler.forEach(item -> System.out.println(item+ " bilet alamadiniz "));
		
	}

}
