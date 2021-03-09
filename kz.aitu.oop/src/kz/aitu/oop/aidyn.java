package kz.aitu.oop.assingment6;

public class aidyn {

	public static void main(String[] args) {
		Logistics first = createLogistics("Truck");
		Logistics second = createLogistics("Drone");
		Transport j1 = first.createTransport();
		Transport j2 = second.createTransport();
		first.planDelivery();
		j1.deliver();
		second.planDelivery();
		j2.deliver();
	}
	public static Logistics createLogistics(String transport){
		switch (transport) {
		case "Ship" : return new SeaLogistics();
		case "Truck" : return new RoadLogistics();
		case "Drone" : return new AirLogistics();
		default: return null;//
		}
		
	};
}