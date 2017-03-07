package testing;

import java.util.ArrayList;

public class ListRunner {
	
	static ArrayList<Item> shoppingList;

	public static void main(String[] args) {
		String[] justDesc = getDesc();
		initList(justDesc);
		doSomeShopping();
		printPurchasedItems();
	}

	private static void doSomeShopping() {
		shoppingList.get(0).setP(true);
		shoppingList.get(3).setP(true);
	}

	private static void printPurchasedItems() {
		for(int i = 0; i < shoppingList.size();i++){
			if(shoppingList.get(i).isPurchased()){
				System.out.println(shoppingList.get(i).getDesc());
				shoppingList.remove(i);
				/*
				 * lines 24 and 25 can be combined as follows:
				 * System.out.println(shoppingList.remove(i).getDesc());
				 */
				i--;
			}
		}
	}

	private static void initList(String[] justDesc) {
		shoppingList = new ArrayList<Item>();
		for(String s: justDesc){
			shoppingList.add(new Item(s));
		}
	}

	private static String[] getDesc() {
		String[] test = {"coffee","video games","potato chips","SOULS"};
		return test;
	}

}
