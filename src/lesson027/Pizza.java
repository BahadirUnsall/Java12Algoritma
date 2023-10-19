package lesson027;

public abstract class Pizza {
	private EPizzaTur tur;
	private EBoyut boyut;
	private EHamurTip tip;
	
	public Pizza(EPizzaTur tur, EBoyut boyut, EHamurTip tip) {
		super();
		this.tur = tur;
		this.boyut = boyut;
		this.tip = tip;
	}

	public EPizzaTur getTur() {
		return tur;
	}

	public void setTur(EPizzaTur tur) {
		this.tur = tur;
	}

	public EBoyut getBoyut() {
		return boyut;
	}

	public void setBoyut(EBoyut boyut) {
		this.boyut = boyut;
	}

	public EHamurTip getTip() {
		return tip;
	}

	public void setTip(EHamurTip tip) {
		this.tip = tip;
	}
	
	
}
