package lesson019;

import java.awt.Container;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamApiOrnek2 {
	/*
	 * User sınıfımız olsun id ve name tostring metod, bilgileriGoster
	 * main users listesi olusturalım içine bir kaç tane user atalım
	 * bütün userlar için bilgilerigoster metodunu cagıralım --> steamapi
	 */
	
	public static void main(String[] args) {
		List<User> users = new ArrayList<User>();
		users.add(new User(1, "bahadir" , 15000,EGender.ERKEK));
		users.add(new User(2, "berkin", 16000,EGender.ERKEK));
		users.add(new User(3, "Ahmet", 17000,EGender.ERKEK));
		users.add(new User(4, "Ahmet", 18000,EGender.ERKEK));
		
		users.forEach(User::bilgileriGoster);
		
		
		
		
		System.out.println("-------id'si 3 ten buyuk olanlar-----------");
		
		List<User> uctenBuyukler = users.stream().filter(o->o.getId()>3).toList();
		uctenBuyukler.forEach(o->System.out.println(o));
		
		System.out.println("--------ismi ahmet olanlar----------");
		
		List<User> ismiAhmetOlanlar = users.stream().filter(o->o.getName().equals("Ahmet")).toList();
		ismiAhmetOlanlar.forEach(o->System.out.println(o));
		
		Set<User> ahmetlerSet = users
								.stream()
								.filter(o->o.getName().equals("Ahmet"))
								.collect(Collectors.toSet());
		System.out.println("----------------------------------------");
		System.out.println(ahmetlerSet);
		System.out.println("----------------------------------------");
		
		List<User> calisanlar = users.stream()
								.map(user -> new User(user.getId(), user.getName() + "BA")).collect(Collectors.toList());
		calisanlar.forEach(User::bilgileriGoster);
		
		
		System.out.println("----------------------------------------");
		
		users.stream().sorted((u1,u2)-> u1.getSalary() - u2.getSalary()).forEach(User::bilgileriGoster);
		
		
		Map<Integer, Integer> isimMaasList = users.stream().collect(Collectors.toMap(User::getId, User::getSalary));
		
		isimMaasList.forEach((key,value) -> System.out.println(key + " " + value));
		
		
		
		
		
		
		
	}

}
