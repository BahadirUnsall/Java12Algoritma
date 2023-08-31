package lesson011.oop01;

public class Test {

	public static void main(String[] args) {
		UserProfile user = new UserProfile();
		
		user.name = "Bahadir";
		user.surName= "Unsal";
		user.age = 24;
		user.followers = 110;
		user.following = 160;
		
		user.addFriend();
		user.createPost();
		user.editProfile();
		user.shareStory();
		user.getInformations();
	}

}
