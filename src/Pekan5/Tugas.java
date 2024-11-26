package Pekan5;

public class Tugas {

	public static void main(String[] args) {
		 int n = 6;
	        for (int i = 0; i < n * 2 + 1; i++) {
	            System.out.print("-");
	        }
	        System.out.println();

	        for (int i = 1; i <= n; i++) {
	            System.out.print("|");
	            for (int j = i; j < n; j++) {
	                System.out.print(" ");
	            }
	            System.out.print("<>");
	            for (int j = 1; j < (i - 1) * 2 + 1; j++) {
	                System.out.print(".");
	            }
	            if (i > 1) {
	                System.out.print("<>");
	            }
	            for (int j = i; j < n; j++) {
	                System.out.print(" ");
	            }
	            System.out.println("|"); 
	        }

	        for (int i = n - 1; i >= 1; i--) {
	            System.out.print("|");
	            for (int j = n; j > i; j--) {
	                System.out.print(" ");
	            }
	  
	            System.out.print("<>");
	            for (int j = 1; j < (i - 1) * 2 + 1; j++) {
	                System.out.print(".");
	            }
	            if (i > 1) {
	                System.out.print("<>");
	            }

	            for (int j = n; j > i; j--) {
	                System.out.print(" ");
	            }
	            System.out.println("|");
	        }
	        for (int i = 0; i < n * 2 + 1; i++) {
	            System.out.print("-");
	        }
	        System.out.println();
	}

}