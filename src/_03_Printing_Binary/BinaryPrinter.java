package _03_Printing_Binary;

public class BinaryPrinter {
	// Complete the methods below so they print the passed in parameter in binary.
	// Don't be afraid to use the methods that are already complete to finish the
	// others.
	// Create a main method to test your methods.
	
	public void printByteBinary(byte b) {
		String print = "";
		int output = 0;
		if(b<0) {
			print += "1";
		}else {
			print += "0";
		}
		//find highest value, remove left most value
		int ctr = 1;
		while(output < b) {
			output *= 2;
		}
		print += "1";
		//find combination of values
		while(output != b) {
			if(output + output/(2*ctr) < b) {
				output += output/(2*ctr);
				print += "1";
				
			}
			print += "0";
		}
		System.out.println(b + " in binary is " + print);
	}

	public void printShortBinary(short s) {

	}

	public void printIntBinary(int i) {

	}

	public void printLongBinary(long l) {

	}
	public static void main(String[] args) {
		BinaryPrinter bp = new BinaryPrinter();
		bp.printByteBinary(1);
		
		
	}
}
