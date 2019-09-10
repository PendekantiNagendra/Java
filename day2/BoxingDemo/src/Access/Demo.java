package Access;

public class Demo {
	public int x = 12;
	private String name = "Nagendra";
	protected String city = "Bangalore";
	double basic = 89546;

	public static void main(String[] args) {
		Demo obj = new Demo();
		System.out.println(obj.x);
		System.out.println(obj.name);
		System.out.println(obj.basic);
		System.out.println(obj.city);
	}

}
