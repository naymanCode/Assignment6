package kz.aitu.oop.assingment6;

public class SeaLogistics extends Logistics{
	public Transport createTransport() {return new Ship();};
	public void planDelivery () {System.out.println("\"Departure at 06:00, acroos the pacific ocean");};
}
