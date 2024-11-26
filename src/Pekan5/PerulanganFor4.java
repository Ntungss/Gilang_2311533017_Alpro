package Pekan5;

import java.util.Scanner;

public class PerulanganFor4 {

	public static void main(String[] args) {
		int jumlah = 0;
		int batas;
		Scanner a = new Scanner(System.in);
		System.out.println("Masukkan nilai batas = ");
		batas = a.nextInt();
		a.close();
		for(int i = 1;i<=batas;i++) {
			System.out.print(i);
			jumlah = jumlah + i;
			if (i<batas) {
				System.out.print(" + ");
			} else {
				System.out.print(" = ");
			}
	}
		System.out.println();
		System.out.println("Jumlah = " + jumlah);
	}

}