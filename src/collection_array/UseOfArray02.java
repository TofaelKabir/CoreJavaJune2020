package collection_array;

public class UseOfArray02 {
	/*
	 * Author: Shohag, Organised by: Tofael
	 */

	public static void main(String[] args) {
		int [] a = new int[6]; // declaring size of the array
		a[0] = 5;
		a[1] = 15;
		a[2] = 50;

		a[5] = 56;
		//NEW
		//adding value in index [6]
		a[6]=9; //what will happen if we don't comment it out? //Ans: Array length is fixed in size, here 6

		// print single index value:
		System.out.println("\n------------- Printing single index value -------------");
		System.out.println("Single index value: " + a[0]);// output: 5
		System.out.println("Single index value: " + a[3]);// output: 0
		System.out.println("Single index value: " + a[5]);// output: 56
		
		System.out.println("Single index value: "+a[6]);//output: ?
		// ArrayIndexOutOfBoundsException
	}
}