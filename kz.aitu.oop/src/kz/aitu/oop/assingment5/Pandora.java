package kz.aitu.oop.assingment5;

import java.util.ArrayList;
import java.util.List;

public class Pandora<T extends Number,V> {
	private V v;
	private T t;
	
	Pandora (T t, V v){
		this.t = t;
		this.v = v;
	}
	Pandora (){
	}

	
	private List<T> keyList = new ArrayList();
	private List<V> valueList = new ArrayList();
	
	public void add(T key, V value) {
		keyList.add(key);
		valueList.add(value);
		
	}
	public void printDescription() {
		System.out.print("KEYS: ");
		for (T key : keyList)
			{System.out.print(key + " ");}
		System.out.println();
		System.out.print("VALUES: ");
		for (V value : valueList)
			System.out.print(value + " ");
		System.out.println();
		System.out.println(t.getClass().getSimpleName());
		System.out.println(v.getClass().getSimpleName());
	}
	public void getSum() {
		double sum=0;
		for (T box : keyList)
		{sum += box.doubleValue();}
		System.out.println("The sum of numbers: "+sum);
	}
	
	
	
	public static <T extends Number> void arithMean(T[] f) {
		double sum=0;
		for (int i=0;i<f.length;i++) {
			sum+=(f[i]).doubleValue();
			
		}
		System.out.println("The Arithmetical Mean of numbers: "+ sum/f.length);
		
	};
	//public List<T> get() {
	//return keyList;}
	
}
