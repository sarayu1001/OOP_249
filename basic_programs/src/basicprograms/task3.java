//Widening & Narrowing
package basicprograms;

public class task3 {

	public static void main(String[] args) {
		int intval=123456789;
		long longval =intval;
		float floatval=longval;
		
		System.out.println("Original value: "+intval);
		System.out.println("Converted to long: "+longval);
		System.out.println("Converted to float: "+floatval);
		
		if(intval == (int) floatval) {
			System.out.println("no data lost");
		}else {
			System.out.println("Yes data maybe lost");
		}
	}
}
