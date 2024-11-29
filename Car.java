package project;

public class Car {
	private int carId;
	private String model;
	private String brand;
	private double basePrize;
	private boolean isAvailable;

	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(int carId, String model, String brand, double basePrize) {
		super();
		this.carId = carId;
		this.model = model;
		this.brand = brand;
		this.basePrize = basePrize;
		this.isAvailable = false;
	}

	public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getBasePrize() {
		return basePrize;
	}

	public void setBasePrize(double basePrize) {
		this.basePrize = basePrize;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	double totalPrize(int days) {
		return basePrize * days;
	}

//	void rent() {
//		isAvailable = false;
//	}

	void returned() {
		isAvailable = true;
	}

	@Override
	public String toString() {
		return "Car [carId=" + carId + "\t| model=" + model + "\t| brand=" + brand + "\t| basePrizePerDay=" + basePrize
				+ "\t| isAvailable=" + isAvailable + "]";
	}

}
