package OctBatch;

import java.util.Scanner;

public class Scan {

	public int sum(int a, int b) {
		int c = a + b;
		return c;

	}

	public int sub(int b, int c) {
		int d = b - c;
		return d;

	}

	public int mul(int x1, int x2) {
		int x3 = x1 * x2;
		return x3;

	}

	public int div(int e, int f) {
		int g = e / f;
		return g;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ASSIGNMENT 1 (((((x1+x2)+x3)-x4)*x5)/x6)

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of x1");
		int x1 = s.nextInt();

		System.out.println("Enter the value of x2");
		int x2 = s.nextInt();

		System.out.println("Enter the value of x3");
		int x3 = s.nextInt();

		System.out.println("Enter the value of x4");
		int x4 = s.nextInt();

		System.out.println("Enter the value of x5");
		int x5 = s.nextInt();

		System.out.println("Enter the value of x6");
		int x6 = s.nextInt();

		Scan sc = new Scan();
		int sumresult = sc.sum(x1, x2);

		int sumresult2 = sc.sum(sumresult, x3);

		int subresult = sc.sub(sumresult2, x4);

		int multiresult = sc.mul(subresult, x5);

		int divresult = sc.div(multiresult, x6);

		System.out.println("The final result of Assignment 1 is " + divresult);

		// ASSIGNMENT 2 (((((x1*x2)-x3)+x4)-x5)/x6)

		int mul = sc.mul(x1, x2);
		int sub = sc.sub(mul, x3);
		int add = sc.sum(sub, x4);
		int sub2 = sc.sub(add, x5);
		int div = sc.div(sub2, x6);

		System.out.println("The final result  of assignment 2 is " + div);

	}

}
