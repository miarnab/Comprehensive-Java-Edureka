package Module_4;

public enum BikePerformance {
	pulsar(200),yamahaFZ(250),heroExtreme(220),hondaCBR(180);

	private int performance;

	public int getPerformance() {
		return performance;
	}
	private BikePerformance(int performance) {
		this.performance=performance;
	}
	
}