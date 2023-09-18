package lesson016;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueOrnek3 {

	public static void main(String[] args) {
		Queue<Hasta> hastaSira = new PriorityQueue<Hasta>();
		
		hastaSira.add(new Hasta("ahmet", ESikayet.APANDIST));
		hastaSira.add(new Hasta("mehmet", ESikayet.BASAGRI));
		hastaSira.add(new Hasta("kerem", ESikayet.YANIK));
		hastaSira.add(new Hasta("hakan", ESikayet.YANIK));
		hastaSira.add(new Hasta("yeliz", ESikayet.BASAGRI));
		
		while(hastaSira.iterator().hasNext()) {
			System.out.println(hastaSira.poll() + " tedavi olmustur.");
		}
		
		
		
		
	}

}
