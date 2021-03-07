package kz.aitu.oop.assingment6;

public class RoadLogistics extends Logistics{
	public Transport createTransport() {return new Truck();};
	public void planDelivery () {System.out.println("The address is not far away, so I choose road delivery");};
}
