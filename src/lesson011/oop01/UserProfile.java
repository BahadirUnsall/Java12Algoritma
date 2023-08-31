package lesson011.oop01;

public class UserProfile {
	String userName;
	int age;
	int followers;
	int following;
	String avatar;
	int postCount;
	String name;
	String surName;

	public void editProfile() {
		System.out.println(name + " Profilini duzenledi.");
	}

	public void createPost() {
		System.out.println("Post olusturuldu.");
	}

	public void shareStory() {
		System.out.println("Hikaye olusturuldu.");
	}

	public void addFriend() {
		System.out.println("Takip edildi.");
	}
	public void getInformations() {
		System.out.println("------Kullanici Bilgileri------");
		System.out.println("isim soy isim= " + name + " " + surName);
		System.out.println("kullanici ismi= " + userName);
		System.out.println("post sayisi= " + postCount);
		System.out.println("takipci sayisi= " + followers);
		System.out.println("kullanici ismi= " + userName);
	}
}
