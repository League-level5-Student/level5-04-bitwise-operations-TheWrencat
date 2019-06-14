package _03_Printing_Binary;

public class BinaryPrinter {
	// Complete the methods below so they print the passed in parameter in binary.
	// Don't be afraid to use the methods that are already complete to finish the
	// others.
	// Create a main method to test your methods.

	public void printByteBinary(byte b) {
		String print = "";
		print += (b & 128) >> 7;
		print += (b & 64) >> 6;
		print += (b & 32) >> 5;
		print += (b & 16) >> 4;
		print += (b & 8) >> 3;
		print += (b & 4) >> 2;
		print += (b & 2) >> 1;
		print += (b & 1);

		System.out.println(b + " in binary is " + print);
	}

	public void printShortBinary(short s) {
		String print = "";

		print += (s & 32768) >> 16;
		print += (s & 16384) >> 14;
		print += (s & 8192) >> 13;
		print += (s & 4096) >> 12;
		print += (s & 2048) >> 11;
		print += (s & 1024) >> 10;
		print += (s & 512) >> 9;
		print += (s & 256) >> 8;
	
		print += (s & 128) >> 7;
		print += (s & 64) >> 6;
		print += (s & 32) >> 5;
		print += (s & 16) >> 4;
		print += (s & 8) >> 3;
		print += (s & 4) >> 2;
		print += (s & 2) >> 1;
		print += (s & 1);

		System.out.println(s + " in binary is " + print);
	}

	public void printIntBinary(int i) {

	}

	public void printLongBinary(long l) {

	}

	public static void main(String[] args) {
		BinaryPrinter bp = new BinaryPrinter();
		byte by = 2;
		bp.printByteBinary(by);
		short sh = 200;
		bp.printShortBinary(sh);

	}
}
