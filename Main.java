import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to Mayuresh Vending Machine");
		System.out.println("This Machine will tell you whether you are going to have a good or a bad day. ");
		System.out.println("Put your lucky Number ");
		int num = scan.nextInt();
		System.out.println("If you get 1 which means you will have a good day and 2 will ");

		System.out.println("You got the number : "  + recursiveForTheDay(num));
 }	

		public static int recursiveForTheDay(int number){
		if(number <= 50){
			return 1;
		}else{
			int s = 50;
			return 1+recursiveForTheDay(number/s);
		}

	
	
	
	}
}