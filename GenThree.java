/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
	int minLimit = Integer.parseInt(args[0]);
		int maxLimit = Integer.parseInt(args[1]);

		int randomNum1 =(int) (Math.random()*(maxLimit-minLimit)+minLimit);
		int randomNum2 =(int) (Math.random()*(maxLimit-minLimit)+minLimit);
		int randomNum3 =(int) (Math.random()*(maxLimit-minLimit)+minLimit);

		System.out.println(randomNum1);
		System.out.println(randomNum2);
		System.out.println(randomNum3);

		int minimal = Math.min(randomNum1, randomNum2);
		minimal = Math.min(minimal, randomNum3);

		System.out.println("The minimal generated number was "+ minimal);
	}
}
