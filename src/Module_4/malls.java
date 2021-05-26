package Module_4;

public class malls extends commercial implements buildings {
	int n;
	int area;
	malls(){
		n=0;
		area=0;
	}
	malls(int y){
		super(y);
	}
	@Override
	public int rooms(int y,int z) {
		n=y;
		area=z;
		int total=n*area;
		return total;
	}
	@Override
	public void display(int total) {
		super.display();
		System.out.println("The price of the mall: "+total);
	}
}
