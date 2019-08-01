 import java.util.ArrayList;
import java.util.Scanner;

public class CarDealershipApp {
	public static void main(String[] args) {
		int userNum;
		String userMake;
		String userModel;
		int userYear;
		double userPrice;
		int userMileage;
		String userCond;

		ArrayList<Car> cars = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		// ArrayList<UsedCar> usedCars = new ArrayList<>();

		System.out.println("Welcome to the Grand Circus Motors admin Console!");
		System.out.println("How many cars are you entering?");
		userNum = scan.nextInt();
		scan.nextLine();

		System.out.println("Is this car new or used?");
		userCond = scan.nextLine();

		do {

			for (int i = 0; i < userNum; i++) {
				int x = i + 1;

				System.out.println("What is the car make: ");
				userMake = scan.nextLine();
				System.out.println("What is the car model: ");
				userModel = scan.nextLine();
				System.out.println("What is the car year: ");
				userYear = scan.nextInt();
				System.out.println("What is the car price: ");
				userPrice = scan.nextInt();
				x++;
				System.out.println("Enter Car: " + x);
				Car c = new Car(userMake, userModel, userYear, userPrice);
				cars.add(c);
				scan.nextLine();
				System.out.println("Is this car new or used?");
				userCond = scan.nextLine();

			}

		} while (userCond.equalsIgnoreCase("new"));
		{
			if (userCond.equalsIgnoreCase("Used")) {
				for (int i = 0; i < userNum; i++) {
					int x = i + 1;

					System.out.println("What is the car make: ");
					userMake = scan.nextLine();
					System.out.println("What is the car model: ");
					userModel = scan.nextLine();
					System.out.println("What is the car year: ");
					userYear = scan.nextInt();
					System.out.println("What is the Mileage on this Vehicle?");
					userMileage = scan.nextInt();
					System.out.println("What is the car price: ");
					userPrice = scan.nextInt();
					scan.nextLine();
					x++;
					System.out.println("Enter Car: " + x);
					UsedCar a = new UsedCar(userMake, userModel, userYear, userPrice, userMileage);
					cars.add(a);
				}

			}

			int counter = 1;

			for (Car t : cars) {
				System.out.println(counter++ + ". " + t);

			}

		}

	}
}
