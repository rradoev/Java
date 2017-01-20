
public class ColaVendingMachine {

	/**
	 * Create a class machine
	 * Create a class bottle
	 * 
	 * static field how many bottles are in the machine
	 * final field how many a cola costs
	 * 
	 * method to subtract 1 from total bottles field
	 * method to buy a bottle
	 * method to display how much a bottle costs and how much the client was charged
	 * method to restock bottles
	 * 
	 * dispaly how many bottles are left
	 * display how many bottles are restocked
	 */
	
	private static int bottlesInventory = 100;
	private static int machineInventoryLimit = 200;
	private double price = new ColaBottle().getColaPrice();
	
	public ColaVendingMachine () {}
	
	public void SubtractBottlesInventory(int bottlesBought) {
		bottlesInventory -= bottlesBought;
	}
	
	public void BuyBottle (int bottlesBought) {
		System.out.printf("Customer bought %s bottles of cola.%n",bottlesBought);
		System.out.printf("One bottle of cola costs: $%s%n", price);
		System.out.println("Customer was charged: $" + String.format("%1$.2f.", bottlesBought * price));
		SubtractBottlesInventory(bottlesBought);
	}
	
	// PERFORM CHECKS HERE ??
	public void Restcok (int bottlesRestocked) {
		bottlesInventory += bottlesRestocked;
	}
	
	public void DisplayInventory () {
		System.out.println("The vending machine currently has: " + bottlesInventory + " bottles left");
	}
	
	// TO DO: PERFORM CHECKS HERE ?
	private boolean CheckInventoryLimit () {
		if (machineInventoryLimit > 200) {
			return true;
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		ColaVendingMachine cvm = new ColaVendingMachine();
		cvm.DisplayInventory();
		cvm.BuyBottle(10);
		cvm.DisplayInventory();
		
		System.out.println("--- Restocking machine ---");
		cvm.Restcok(150);		// TO DO: Add limit to restocking or to the vending machine.
		cvm.DisplayInventory();
	}
	
}
