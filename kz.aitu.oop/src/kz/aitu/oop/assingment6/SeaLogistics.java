package kz.aitu.oop.assingment6;

public class SeaLogistics extends Logistics{
	public Transport createTransport() {return new Ship();};
	public void planDelivery () {System.out.println("The delivery address is remote and fenced off by the sea. I choose sea delivery");};
}
