import java.util.Scanner;
import java.text.NumberFormat;
public class P02 {
	public static void main(String[] args) {
		int miles;
		double km;
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()){
			miles=cin.nextInt();
			km=1.6*miles;
			System.out.printf("%.1f\n", km);
		}
	}
}
