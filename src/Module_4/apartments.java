package Module_4;

public class apartments extends residential implements buildings {
	int n;
	int area;
	apartments(){
		n=0;
		area=0;
	}
	apartments(int w){
		super(w);
	}
	@Override
	public int rooms(int w,int x) {
		n=w;
		area=x;
		int total=0;
		total=n*area;
		return total;
	}
	@Override
	public void display(int total) {
		super.display();
		System.out.println("The price of the apartment: "+total);
	}
}
