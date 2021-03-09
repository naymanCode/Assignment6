package kz.aitu.oop.assingment6;

public class AirLogistics extends Logistics{
	public Transport createTransport() {return new Drone();};
	public void planDelivery () {System.out.println("Departure at 12:00, direction number 2");};
}
