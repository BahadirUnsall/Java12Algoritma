package lesson025.solid.util.openClosed;

public abstract class SocialMedia implements IScale{
	private int scaleRatio;

	public SocialMedia(int scaleRatio) {
		super();
		this.scaleRatio = scaleRatio;
	}

	public int getScaleRatio() {
		return scaleRatio;
	}

	public void setScaleRatio(int scaleRatio) {
		this.scaleRatio = scaleRatio;
	}
	
	
}
