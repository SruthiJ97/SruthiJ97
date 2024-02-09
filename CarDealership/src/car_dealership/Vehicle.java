package car_dealership;

public class Vehicle {

	private double price;
	private String vehicle_name;
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getVehicle_name() {
		return vehicle_name;
	}
	public void setVehicle_name(String vehicle_name) {
		this.vehicle_name = vehicle_name;
	}
		
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((vehicle_name == null) ? 0 : vehicle_name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicle other = (Vehicle) obj;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (vehicle_name == null) {
			if (other.vehicle_name != null)
				return false;
		} else if (!vehicle_name.equals(other.vehicle_name))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Vehicle [price=" + price + ", vehicle_name=" + vehicle_name + "]";
	}
	
}
