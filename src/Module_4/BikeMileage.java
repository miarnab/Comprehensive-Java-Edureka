package Module_4;

public enum BikeMileage {
	pulsar(50),yamahaFZ(60),heroExtreme(55),hondaCBR(57);

	private int mileage;

	public int getMileage() {
		return mileage;
	}
	private BikeMileage(int mileage) {
		this.mileage=mileage;
	}
	
}
