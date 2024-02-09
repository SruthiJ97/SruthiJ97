package car_dealership;

public class Employee {

	String name;
	
	public void handleCustomer(Customers cust, boolean finance, Vehicle vehicle) {
		if(finance == true) {
			double loanAmount = vehicle.getPrice() - cust.getCashOnHand();
			runCreditHistory(cust, loanAmount);
		} else if(vehicle.getPrice() <= cust.getCashOnHand()) {
			//customer pays in cash
			processTransacion(cust, vehicle);
		} else {
			System.out.println("Customer " + cust.getName() + " , please bring more money to purchase vehicle " + vehicle.getVehicle_name());
		}
	}
	
	public void runCreditHistory(Customers cust, double loanAmount) {
		System.out.println("Ran credit history for customer " + cust.getName());
		System.out.println("Customer " + cust.getName() + " has approved to purchase the car");
	}
	
	public void processTransacion(Customers cust, Vehicle vehicle) {
		System.out.println("Customer " + cust.getName() + " has purchased the vehicle named as " + vehicle.getVehicle_name()+
				" for the price " + vehicle.getPrice());
		
	}
}
