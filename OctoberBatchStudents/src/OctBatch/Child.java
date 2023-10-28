package OctBatch;

public class Child extends parent {

	public Child() {

		this(1, 3, 5);

		System.out.println("This is Child Class Default Constructor");
	}

	public Child(int x) {

		this();
		System.out.println("This is Child Class One Parameterized Constructor");
	}

	public Child(int x, int y) {
		super(22, 33);

		System.out.println("This is Child Class Two Parameterized Constructor");
	}

	public Child(int x, int y, int z) {

		this(44, 55);

		System.out.println("This is Child Class Three Parameterized Constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child c = new Child(4);
	}

}
