package OctBatch;

public class Assignment {

	public Assignment() {
		this(6, 7, 8);

		System.out.println("This is a default constructor");

	}

	public Assignment(int a) {
		this();
		System.out.println("This is a One parameterized constructor");

	}

	public Assignment(int a, int b) {
		this(2, 3, 4, 5);
		System.out.println("This is a Two parameterized constructor");

	}

	public Assignment(int a, int b, int c) {
		System.out.println("This is a Three parameterized constructor");

	}

	public Assignment(int a, int b, int c, int d) {
		this(77);
		System.out.println("This is a Four parameterized constructor");

	}

	public static void main(String[] args) {

		Assignment s = new Assignment(88, 99);
	}

}
