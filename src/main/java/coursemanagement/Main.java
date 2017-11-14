package coursemanagement;

import java.io.IOException;
import java.util.Scanner;

import coursemanagement.controller.MenuController;
import coursemanagement.util.Constants;


public class Main {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		MenuController mc = new MenuController();
		mc.showMainMenu();
		
		Scanner scanner = new Scanner(System.in);
		int selection = scanner.nextInt();
		
		switch (selection) {
			case Constants.MENU_ITEM_STUDENTS:
				System.out.println("Manage Students");
				System.out.println("---------------------------------");
				System.out.println();
				System.out.println("1 - Register student");
				System.out.println("2 - Unregister student");
				System.out.println("3 - Get student list");
				System.out.println("4 - Edit student");
				
				System.out.println();
				System.out.print("Select menu item :  ");

				selection = scanner.nextInt();
				
				break;
				
			case Constants.MENU_ITEM_COURSES:
				break;
				
			case Constants.MENU_ITEM_GRADES:
				break;
		}
	}
}
