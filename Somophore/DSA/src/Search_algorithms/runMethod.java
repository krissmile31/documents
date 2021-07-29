package Search_algorithms;

import java.util.Scanner;

public class runMethod {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a list of n integers:\n n = ");
		int n = sc.nextInt();
		sc.nextLine();
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.format("a[%d] = ", i);
			a[i] = sc.nextInt();
		}
		System.out.print("Enter a integer for searching: ");
		int m = sc.nextInt();
		System.out.println("The position of the integer: " + BinarySearch(a, m));
	}

	public static int BinarySearch(int[] a, int m) {
		int left = 0;
		int right = a.length - 1;
		int mid;

		while (left <= right) {
			mid = (left + right) / 2;
			if (a[mid] == m)
				return mid;
			else if (a[mid] < m)
				left = mid + 1;
			else
				right = mid - 1;
		}
		return -1;
	}

}
