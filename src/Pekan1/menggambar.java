package Pekan1;

public class menggambar {

	public static void main(String[] args) {
	    egg();
	    teaCup();
	    stopSign();
	    hat();
	    //Draws the top half of an egg figuree   
	}
	public static void eggTop() {
		System.out.println("  ________");
		System.out.println(" /        \\");
		System.out.println("/          \\");
	}
	//Draws the bottom half of an egg figure
	public static void eggBottom() {
		System.out.println("\\          /");
		System.out.println(" \\________/");
	}
	public static void egg() {
		eggTop();
		eggBottom();
		System.out.println();
	}
	public static void teaCup() {
		eggBottom();
		line();
		System.out.println();
	}
	public static void stopSign() {
		eggTop();
		System.out.println("|   STOP    |");
		eggBottom();
		System.out.println();
	}
	public static void hat() {
		eggTop();
		line();
	}
	public static void line() {
		System.out.println("+----------+");
	}
	
}