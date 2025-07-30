package basicprograms;

public class task1 {

	public static void main(String[] args) {

		
		byte byteVar=10;
		short shortVar=1000;
		int intVar=45588;
		long longVar=10000000000L;
		float floatVar=72.631f;
		double doubleVar=3.14159265359;
		char charVar='A';
		boolean booleanVar=true;
		
		System.out.println("byte value: "+byteVar+", Size: "+Byte.BYTES+ "bytes");
		System.out.println("short value: "+shortVar+", Size: "+Short.BYTES+ "bytes");
		System.out.println("int value: "+intVar+", Size: "+Integer.BYTES+ "bytes");
		System.out.println("long value: "+longVar+", Size: "+Long.BYTES+ "bytes");
		System.out.println("float value: "+floatVar+", Size: "+Float.BYTES+ "bytes");
		System.out.println("double value: "+doubleVar+", Size: "+Double.BYTES+ "bytes");
		System.out.println("char value: "+charVar+", Size: "+Character.BYTES+ "bytes");
		System.out.println("boolean value: "+booleanVar+", Size: "+ "1 bit");

	}

}
