package kz.aitu.oop.assingment6;

public class RoadLogistics extends Logistics{
	public Transport createTransport() {return new Truck();};
	public void planDelivery () {System.out.println("Departure at 10:00, the way number 1");};
}
