//Bài tập 10.
//Tính T(x, n) = x^n
//Trong đó x, n được nhập từ người dùng

package lap1_18126035;

import java.util.Scanner;

public class Exercise10 {
	public static void main(String[] args) {
		System.out.println("Tinh T(x, n) = x^n");
		System.out.print("Nhap x: ");

		Scanner sc1 = new Scanner(System.in);
		double x = sc1.nextDouble();

		System.out.print("Nhap n: ");
		Scanner sc2 = new Scanner(System.in);
		double n = sc2.nextDouble();

		System.out.println("T(" + x + ", " + n + ") = " + x + "^" + n + " = " + Math.pow(x, n));

	}
}
