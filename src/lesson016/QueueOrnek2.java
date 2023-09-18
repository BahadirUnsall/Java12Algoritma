package lesson016;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;


public class QueueOrnek2 {
	
	public static void main(String[] args) {
		Queue<Musteri> kuyruk = new PriorityQueue<>(Comparator.comparing(Musteri::getYas).reversed());
		
		kuyruk.add(new Musteri("ahmet", 25));
		kuyruk.add(new Musteri("mehmet", 30));
		kuyruk.add(new Musteri("recep", 18));
		kuyruk.add(new Musteri("selin", 35));
		
		while(kuyruk.iterator().hasNext()) {
			System.out.println(kuyruk.poll());
		}
		
		
	}

}
