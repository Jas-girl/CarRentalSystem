package project;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Rental {
	Scanner sc=new Scanner(System.in);
	ArrayList<Car> car =new ArrayList<Car>();
	ArrayList<Customer> cust=new ArrayList<Customer>();
	Customer c=new Customer();
	String date="";
	
	void add(ArrayList<Car> car) {
		this.car=car;
		System.out.println("Enter the id");
		int id=sc.nextInt();
		System.out.println("Enter the model");
		String model=sc.next();
		System.out.println("Enter the brand");
		String brand=sc.next();
		System.out.println("Enter the price");
		double price=sc.nextDouble();
		this.car.add(new Car(id,model,brand,price));
		System.out.println("Added successfully");
	}
	
	void view(ArrayList<Car> car) {
		System.out.println("\n***********************************");
        this.car=car;
		for (Car car2 : car) {
			System.out.println(car2);
		}
		System.out.println("\n***********************************");
	}
	
	void searchName(ArrayList<Car> car) {
		System.out.println("\n***********************************");
		this.car=car;
		System.out.println("Enter the name");
		String name=sc.next();
		for (Car car2 : car) {
			if(car2.getModel().equalsIgnoreCase(name)) {
				System.out.println(car2);
				break;
			}
		}
		System.out.println("\n***********************************");
	}
	void searchBrand(ArrayList<Car> car) {
		System.out.println("\n***********************************");
		this.car=car;
		System.out.println("Enter the brand");
		String brand=sc.next();
		for (Car car2 : car) {
			String ch=car2.getBrand().toLowerCase();
			if(ch.contains(brand) || ch.equalsIgnoreCase(brand) ) {
				System.out.println(car2);
				
			}
		}
		System.out.println("\n***********************************");
	}
	void searchPrize(ArrayList<Car> car) {
		System.out.println("\n***********************************");
		this.car=car;
		System.out.println("Enter the price range");
		double price=sc.nextDouble();
		for (Car car2 : car) {
			if(car2.getBasePrize()<=price) {
				System.out.println(car2);
			}
		}
		System.out.println("\n***********************************");
	}
	void rent(ArrayList<Car> car) {
		System.out.println("\n***********************************");
		this.car=car;
		System.out.println("Enter the userName");
		String username=sc.next();
		System.out.println("Enter the userId");
		int id=sc.nextInt();
		System.out.println("Enter the no. of days u need the car");
		int n=sc.nextInt();
		LocalDate l=LocalDate.now();
		String s=l.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		System.out.println("Current Date: "+s);
		System.out.println("Enter the car name to rent it");
		String name=sc.next();
		for (Car car2 : car) {
			if(car2.getModel().equalsIgnoreCase(name)) {
				System.out.println("Total Price:"+car2.getBasePrize()*n);
				System.out.println(car2);
				LocalDate returnDate=l.plusDays(n);
				String s1=returnDate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
				System.out.println("Return Date: "+s1);
				car2.setAvailable(true);
				c=new Customer(username,id);
				cust.add(c);
				c.setCar(car2);
				System.out.println(c.toString());
	
			}
		}
		System.out.println("\n***********************************");
		
	}
	void returnCar(ArrayList<Car> car) {
		System.out.println("\n***********************************");
		this.car=car;
		System.out.println("Enter the userName");
		String username=sc.next();
		System.out.println("Enter the userId");
		int id=sc.nextInt();
		System.out.println("Enter the car");
		String name=sc.next();
		Customer user=null;
		
		for (Customer person : cust) {
			if(person.getName().equalsIgnoreCase(username) && person.getId()==id) {
				user=person;
			}
		}
		
		if(user==null ) {
			System.out.println("Car is not returned");
		}
		else {
			for (Car car2 : car) {
				if(car2.isAvailable()==true && car2.getModel().equalsIgnoreCase(name)) {
					car2.setAvailable(false);
					System.out.println(user);
				}
			}
		}		
		
		System.out.println("\n***********************************");
	}
}
