//Bai tap 28.
//Viet chuong trinh de loai bo cac phan tu trung trong mang mot chieu.
//Vi du: [1, 1, 2, 2, 3, 3, 3, 2, 4] -> [1, 2, 3, 4]

//package lap1_18126035;

import java.util.*;

public class Exercise28 {
	// // ham xuat list (dung ArrayList)
	public static void Output(ArrayList<Integer> a) {
		for (int i = 0; i < a.size(); i++) {

			System.out.print(a.get(i) + "\t");

		}
	}

	//ham xuat mang array binh thuong
	public static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {

			System.out.print(a[i] + "\t");

		}
	}

	public static ArrayList<Integer> deleteDuplicates(int arr[]) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i : arr) {
			list.add(i);
		}

		for (int i = 0; i < list.size() - 1; i++) {
			boolean flag = false;
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i) == list.get(j)) {
					list.remove(j);
					j--;
					flag = false;
				}
				if (flag == true)
					list.remove(i);

			}
		}

		return list;
	}

	public static void main(String[] args) {
		int[] a = { 1, 1, 2, 2, 3, 3, 3, 2, 4 };
		System.out.println("Mang ban dau: ");
		printArray(a);

		System.out.println();

		System.out.println("\nMang sau khi xoa cac phan tu trung nhau: ");
		ArrayList<Integer> list = deleteDuplicates(a);
		Output(list);
	}
}
