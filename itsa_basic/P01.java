import java.util.Scanner;
public class P01 {
	public static void main(String[] args) {
		String str1="",all="*****",two="*   *",left="*    ",right="    *";
		int len,num1,value,i,j;
		int[] ledNum = new int[4];
		int form[][]={  {0,3,0,0,1,0,2,0,0,0},
				{1,3,3,3,1,2,2,3,1,1},
				{1,3,0,0,0,0,0,3,0,0},
				{1,3,2,3,3,3,1,3,1,3},
				{0,3,0,0,3,0,0,3,0,3} };
		
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()){
			num1=cin.nextInt();
			for(i=3;i>=0;i--){
				ledNum[i]=num1%10;
				num1/=10;
			}
			for(j=0;j<5;j++) {
				for(i=0;i<4;i++){
					value=ledNum[i];
					switch(form[j][value]){
						case 0 : System.out.print(all);break;
						case 1 : System.out.print(two);break;
						case 2 : System.out.print(left);break;
						case 3 : System.out.print(right);break;
					}
					if(i<3)System.out.print(" ");
				}
				System.out.print("\n");
			}
		}
	}

}
