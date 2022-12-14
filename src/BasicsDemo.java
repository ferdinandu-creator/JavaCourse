class BasicsDemo {
  // Adapted from http://www.ntu.edu.sg/home/ehchua/programming/java/J1a_Introduction.html
  static void print() {
    System.out.println("\n\nInside print ...");
    System.out.println("Hello, world!!"); // Advance cursor to beginning of next line
    System.out.println();                 // Print empty line
    System.out.print("Hello, world!!");   // Cursor stayed after the printed string
    System.out.println("Hello,");
    System.out.print(" ");                // Print a space
    System.out.print("world!!");
  }

  static void primitives(){
    System.out.println("\n\nInside print ...");
    int intHex = 0*0041; //16 power 0 * 1 * 4
    System.out.println("intHEX " + intHex);

  }
  
  public static void main(String[] args) {	
	   	// Language Basics 1
		print();
		int i = 6;
		int j = 2;
    System.out.println(i+j);
    System.out.println(i-j);
    System.out.println(i*j);
    System.out.println(i/j);
    System.out.println(i%j);
    primitives();

  }       
}