package df;

import java.util.Scanner;

public class Tester {

	static {
		System.out.println("Loading JavaBanana Architecture... ");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Loading... [|||          ] 20%");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Loading... [|||||        ] 40%");
		
		try {
			Thread.sleep(400);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Loading... [|||||||      ] 60%");
		
		try {
			Thread.sleep(700);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Loading... [|||||||||||  ] 80%");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Loading... [|||||||||||||] 100%");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("-------- \n\n");
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("    _\n"
				+ "   //\\\n"
				+ "   V  \\\n"
				+ "    \\  \\_\n"
				+ "     \\,'.`-.\n"
				+ "      |\\ `. `.       \n"
				+ "      ( \\  `. `-.                        _,.-:\\\n"
				+ "       \\ \\   `.  `-._             __..--' ,-';/\n"
				+ "        \\ `.   `-.   `-..___..---'   _.-' ,'/\n"
				+ "         `. `    `-._        __..--'    ,'\n"
				+ "           `.       `--..''   _.-'    ,'\n"
				+ "             `-._        _.-'      .-'\n"
				+ "                 `\"\"\"---\"\"\"\n"
				+ "");
		
		System.out.println("\n" + "JAVA BANANA SOFTWARE v1.0.0");
	}
	
	public static void main(String[] arhs) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("\nThe JavaBanana Calculator has many operations to help you with math homework.");
		
		boolean continue_ = true;
		REDO: while(continue_) {
			
			System.out.println("Which one would you like to execute? [Add/Subt/Mult/Divi/Quit]");
			
			String t = s.nextLine();
			
			switch(t) {
			
			case "Add":
				System.out.println("Enter first number:");
				String a = s.nextLine();
				int b;
				try {
					b = Integer.parseInt(a);
				}catch(Exception e){
					System.err.println("Banana error!");
					continue REDO;
				}
				System.out.println("Enter second number:");
				String c = s.nextLine();
				int d;
				try {
					d = Integer.parseInt(c);
				}catch(Exception e){
					System.err.println("Banana error!");
					continue REDO;
				}
				System.out.println(b+d);
				break;
				
			case "Subt":
				System.out.println("Enter first number:");
				String z = s.nextLine();
				int z_;
				try {
					z_ = Integer.parseInt(z);
				}catch(Exception e){
					System.err.println("Banana error!");
					continue REDO;
				}
				System.out.println("Enter second number:");
				String x = s.nextLine();
				int x_;
				try {
					x_ = Integer.parseInt(x);
				}catch(Exception e){
					System.err.println("Banana error!");
					continue REDO;
				}
				System.out.println(z_-x_);
				break;
				
			case "Mult":
				System.out.println("Enter first number:");
				String GAHA = s.nextLine();
				int GAH;
				try {
					GAH = Integer.parseInt(GAHA);
				}catch(Exception e){
					System.err.println("Banana error!");
					continue REDO;
				}
				System.out.println("Enter second number:");
				String DINGD = s.nextLine();
				int DING;
				try {
					DING = Integer.parseInt(DINGD);
				}catch(Exception e){
					System.err.println("Banana error!");
					continue REDO;
				}
				System.out.println(GAH*DING);
				break;
				
			case "Divi":
				
				System.out.println("Enter first number:");
				String aa = s.nextLine();
				int bb;
				try {
					bb = Integer.parseInt(aa);
				}catch(Exception e){
					System.err.println("Banana error!");
					continue REDO;
				}
				System.out.println("Enter second number:");
				String cc = s.nextLine();
				int dd;
				try {
					dd = Integer.parseInt(cc);
				}catch(Exception e){
					System.err.println("Banana error!");
					continue REDO;
				}
				
				
				try {
					System.out.println(bb/dd);
				}catch(ArithmeticException ae) {
					System.err.println("    _\n"
							+ "   //\\\n"
							+ "   V  \\\n"
							+ "    \\  \\_\n"
							+ "     \\,'.`-.\n"
							+ "      |\\ `. `.       \n"
							+ "      ( \\  `. `-.                        _,.-:\\\n"
							+ "       \\ \\   `.  `-._             __..--' ,-';/\n"
							+ "        \\ `.   `-.   `-..___..---'   _.-' ,'/\n"
							+ "         `. `    `-._        __..--'    ,'\n"
							+ "           `.       `--..''   _.-'    ,'\n"
							+ "             `-._        _.-'      .-'\n"
							+ "                 `\"\"\"---\"\"\"\n"
							+ "");
				}
				break;
				
			case "Quit":
				break REDO;
			}
		}
		
		
		
	}
}

