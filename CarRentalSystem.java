package project;

import java.util.ArrayList;
import java.util.Scanner;

public class CarRentalSystem {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Car> car = new ArrayList<Car>();
		Car carObj1 = new Car(111, "Swift", "Maruti Sazuki", 1500);
		Car carObj2 = new Car(121, "Breza", "Maruti Sazuki", 1500);
		Car carObj3 = new Car(031, "Curvv", "Tata", 2500);
		Car carObj4 = new Car(041, "Nexon", "Tata", 2500);
		Car carObj5 = new Car(1112, "Sonet", "Kia", 1000);
		Car carObj6 = new Car(119, "Fortuner", "Toyota", 3500);
		Car carObj7 = new Car(101, "Creta", "Hyundi", 2000);
		car.add(carObj1);
		car.add(carObj2);
		car.add(carObj3);
		car.add(carObj4);
		car.add(carObj5);
		car.add(carObj6);
		car.add(carObj7);
		Rental cr = new Rental();
		System.out.println("******************Car Rental System*************");
		int ch = 0;
		do {
			System.out.println(
					"Choose1:Add a car\nChoose2:View Cars \nChoose3:Searching \nChoose4: Rent the car \nChoose5: Return the car");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				cr.add(car);
				break;
			case 2:
				cr.view(car);
				break;
			case 3:

				System.out.println("Choose1:Search by Name \nChoose2:Search by brand \nChoose3:Search by price ");
				int ch1 = sc.nextInt();
				switch (ch1) {
				case 1:
					cr.searchName(car);
					break;
				case 2:
					cr.searchBrand(car);
					break;
				case 3:
					System.out.println("Products which are less than that price");
					cr.searchPrize(car);

				}
				break;
			case 4:
				System.out.println("Rent the car");
				cr.rent(car);
				break;
			case 5:
				System.out.println("Return the car");
				cr.returnCar(car);
				break;

			}
		} while (ch < 6);
	}
}
