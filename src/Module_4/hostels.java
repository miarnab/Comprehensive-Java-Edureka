package Module_4;

public class hostels extends residential implements buildings {
	int n;
	int area;
	hostels(){
		n=0;
		area=0;
	}
	hostels(int w){
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
		System.out.println("The price of the hostel: "+total);
	}
}
