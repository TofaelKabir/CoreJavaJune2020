package java_loop;

public class UseOfWhileLoop {

	public static void main(String[] args) {
		int i=1;
		while(i<=10)//when the condition is true, the loop started
		{
			System.out.println("The values are: "+i);
			i++;
		}
		int j = 3;
		while(j<=10)//when the condition is true, the loop started
		{
			System.out.println("The values are: "+j);
			j=j+2;
		}
		int k = 10;
		while(k>=5)//when the condition is true, the loop started
		{
			System.out.println("The values are: "+k);
			k--;
		}
		int m =2;
		int l = 11;
		while(l>5)//when the condition is true, the loop started
		{
			System.out.println("The values are: "+l*m);
			l=l-2;
		}
	}

}
