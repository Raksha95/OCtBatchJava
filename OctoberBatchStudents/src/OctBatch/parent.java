package OctBatch;

public class parent {

	public parent() {
		// TODO Auto-generated constructor stub

		this(6);

		System.out.println("This is Parent class Default Constructor");
	}

	public parent(int a) {
		// TODO Auto-generated constructor stub

		this(8, 1, 9);

		System.out.println("This is Parent class One Parameterized Constructor");
	}

	public parent(int a, int b) {
		// TODO Auto-generated constructor stub

		this();

		System.out.println("This is Parent class Two Parameterized Constructor");
	}

	public parent(int a, int b, int c) {
		// TODO Auto-generated constructor stub

		System.out.println("This is Parent class Three Parameterized Constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
