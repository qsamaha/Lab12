
public class UsedCar extends Car {
	
	private int mileage;



	public UsedCar() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UsedCar(String make, String model, int year, double price, int mileage) {
		super(make, model, year, price);
		this.mileage = mileage;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	
	

	@Override
	public String toString() {
		return super.toString() +" (Used) Mileage: " + mileage;
	} 
	
	
}
