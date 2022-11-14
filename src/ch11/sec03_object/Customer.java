package ch11.sec03_object;
					  //클론을 사용할수 있게 implements Cloneable
public class Customer implements Cloneable {
	String id;
	String name;
	int age;
	boolean adult;
	
	Customer(String id, String name, int age, boolean adult) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.adult = adult;
	}
	//return 타입이 customer
	Customer getCustomer() {
		Customer cloned = null;
		try {
			cloned = (Customer) clone();
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
		return cloned;
	}
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", age=" + age + ", adult=" + adult + "]";
	}
}
