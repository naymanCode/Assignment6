package kz.aitu.oop.assingment6;

public class aidyn {

	public static void main(String[] args) {
		Logistics first = createLogistics("Truck");
		Transport j1 = first.createTransport();
		first.planDelivery();
		j1.deliver();
	}
	public static Logistics createLogistics(String transport){
		switch (transport) {
		case "Ship" : return new SeaLogistics();
		case "Truck" : return new RoadLogistics();
		default: return null;//
		}
		
	};
}
