package Module_4;

public enum BikePower {
	pulsar(40),yamahaFZ(50),heroExtreme(60),hondaCBR(55);

	private int power;

	public int getPower() {
		return power;
	}
	private BikePower(int power) {
		this.power=power;
	}
	
}
