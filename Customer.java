package project;
public class Customer {
	private String name;
	private int Id;
	private Car car;

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(String name, int id) {
		super();
		this.name = name;
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", Id=" + Id + ",Cars="+car+"]";
	}

}
