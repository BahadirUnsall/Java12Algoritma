package lesson025.solid.util.openClosed;

public class Instagram extends SocialMedia{

	public Instagram(int scaleRatio) {
		super(scaleRatio);
		
	}

	
	@Override
	public void scalePhoto(String type) {
		if (type.equals("png")) {
			setScaleRatio(38);
		}else if (type.equals("jpeg")) {
			setScaleRatio(50);
		}else {
			setScaleRatio(45);
		}
	}
	
	
}
