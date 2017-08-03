import java.util.Scanner;
import java.lang.Math;
public class P03 {
	public static void main(String[] args) {
		int dotX,dotY;
		double D;
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()) {
			dotX=cin.nextInt();
			dotY=cin.nextInt();
			D=Math.hypot(dotX,dotY);
			if(D<=100) System.out.println("inside");
			else System.out.println("outside");
		}
	}
}

