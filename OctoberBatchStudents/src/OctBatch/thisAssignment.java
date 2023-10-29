package OctBatch;

public class thisAssignment {

	public thisAssignment() {
		this(6, 7, 8);
		System.out.println("This is a Default constructor");
	}

	public thisAssignment(int a) {
		this();
		System.out.println("This is One parameterized constructor");
	}

	public thisAssignment(int a, int b) {
		this(13, 14, 15, 16);
		System.out.println("This is Two parameterized constructor");
	}

	public thisAssignment(int a, int b, int c) {

		System.out.println("This is Three parameterized constructor");
	}

	public thisAssignment(int a, int b, int c, int d) {
		this(11);
		System.out.println("This is Four parameterized constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		thisAssignment t = new thisAssignment(17, 18);

	}

}
