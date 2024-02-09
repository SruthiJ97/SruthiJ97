package car_dealership;

public class Dealership {

	public static void main(String[] args) {
		
		Customers cust1 = new Customers();
		cust1.setName("Sruthi Ram");
		cust1.setAddress("Anna Nagar ");
		cust1.setCashOnHand(25000);
		
		Vehicle vehicle = new Vehicle();
		vehicle.setVehicle_name("Benz ");
		vehicle.setPrice(20000);
		
		Employee emp = new Employee();
		
		cust1.purchaseCar(vehicle, emp, false);
		
		double balanceAmt = cust1.getCashOnHand() - vehicle.getPrice();
		System.out.println("Balance cash " + balanceAmt);		
	
		Vehicle car = new Vehicle();
		car.setVehicle_name("Benz");
		car.setPrice(18000);
		
		boolean value = car.equals(vehicle);
		System.out.println(value);
			
	}
}
