package challenge;

public class ReverseString {
	
	public static void main (String[]args) {
		String a = "Mohammad Sharkar";
		String r = "";
		
		System.out.println("************** Length **************");
		System.out.println(a.length());
		System.out.println("****************************\n");
		
		System.out.println("************* Character at position ***************");
		System.out.println(a.charAt(6));
		System.out.println("****************************\n");
		
		System.out.println("************** Position of Character **************");
		System.out.println(a.indexOf("S"));
		System.out.println("****************************\n");
		
		System.out.println("************** Position of word **************");
		System.out.println(a.indexOf("ha"));
		System.out.println("****************************\n");
		
		System.out.println("*************** Repetition of same word's position ***************");
		System.out.println(a.indexOf("ha", a.indexOf("ha")+1));
		System.out.println("****************************\n");
		
		System.out.println("*************** to Uppercase ***************");
		System.out.println(a.toUpperCase());
		
		System.out.println("*************** to Lowercase ***************");
		System.out.println(a.toLowerCase());
		
		System.out.println("*************** substring ***************");
		System.out.println(a.substring(3, 8));
		
		System.out.println("*************** substring ***************");
		System.out.println(a.substring(3));
		
		
		// 1. use for loop , count from back to forward
		System.out.println("************** Reverse String **************");
		for(int i = a.length()-1; i>=0; i--) {
			r = r + a.charAt(i);
		}
		System.out.println(r);
		
		// 2. use StringBuffer

        StringBuffer sb = new StringBuffer(a);
        System.out.println(sb.reverse());
		
	}

}
