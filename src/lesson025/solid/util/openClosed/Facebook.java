package lesson025.solid.util.openClosed;

public class Facebook extends SocialMedia{

	public Facebook(int scaleRatio) {
		super(scaleRatio);
		
	}

	@Override
	public void scalePhoto(String type) {
		if (type.equals("png")) {
			setScaleRatio(60);
		}else if (type.equals("jpeg")) {
			setScaleRatio(23);
		}else {
			setScaleRatio(45);
		}
	}

	
}
