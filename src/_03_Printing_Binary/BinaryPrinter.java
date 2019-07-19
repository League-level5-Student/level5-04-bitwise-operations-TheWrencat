package _03_Printing_Binary;

public class BinaryPrinter {
	static // Complete the methods below so they print the passed in parameter in binary.
	// Don't be afraid to use the methods that are already complete to finish the
	// others.
	// Create a main method to test your methods.
	BinaryPrinter bp = new BinaryPrinter();

	public String printByteBinary(byte b) {
		String print = "";
		print += (b & 128) >> 7;
		print += (b & 64) >> 6;
		print += (b & 32) >> 5;
		print += (b & 16) >> 4;
		print += (b & 8) >> 3;
		print += (b & 4) >> 2;
		print += (b & 2) >> 1;
		print += (b & 1);

		return print;
	}

	public String printShortBinary(short s) {

		byte top = (byte)((s & 0xFF00)>>8);
		byte bottom = (byte)(s & 0x00FF);
		String print = "";
		print = "" + bp.printByteBinary(top) + bp.printByteBinary(bottom);
		return print;
	}

	public String printIntBinary(int i) {
		
		short top = (short)((i & 0xFFFF0000)>>16);
		short bottom = (short)(i & 0x0000FFFF);
		String print = "";
		print = "" + bp.printShortBinary(top) + bp.printShortBinary(bottom);
		return print;
	}

	public String printLongBinary(long l) {
		int top = (int)(l >>32);
		int bottom = (int)(l & 0x00000000FFFFFFFF);
		String print = "";
		print = "" + bp.printIntBinary(top) + bp.printIntBinary(bottom);
		return print;
		//128, 64, 32, 16, 8, 4, 2, 1
	}

	public static void main(String[] args) {
		byte by = (byte) 210;
		System.out.println("Byte:\t" + bp.printByteBinary(by));
		//byte by2 = (byte) 12;
		//System.out.println("Byte:\t" + bp.printByteBinary(by2));
		//byte byt = (byte) ((byte)44 << 2);
		//System.out.println("Byte:\t" + bp.printByteBinary(byt));
//		
		//		short sh = 200;
//		System.out.println("Short:\t" + bp.printShortBinary(sh));
//		int in  = 20000;
//		System.out.println("Int:\t" + bp.printIntBinary(in));
//		long lo = 200000000;
//		System.out.println("Long:\t" + bp.printLongBinary(lo));


	}
}
