public class ProductMain {

    public static void main(String[] args) {

        try {
            //creating sample products for the warehouse inventory
            Furniture chair = new Furniture(50.00, 30, 101, "Chair", "Wood");
            Electronics laptop = new Electronics(1000.00, 5, 102, "Laptop", 24);

            //polymorphism: Product array stores Furniture and Electronics objects
            Product[] inventory = {chair, laptop};

            System.out.println("Product Inventory:\n");

            //displaying product details using polymorphism and overridden toString methods
            for (Product item : inventory) {
                System.out.println(item);
                System.out.println();
            }

            //demonstrating the restock method
            System.out.println("Restocking Chair by 20 units...");
            chair.restock(20);

            System.out.println("New Quantity: " + chair.getQuantity());
            System.out.println("New Total Value: $" + String.format("%.2f", chair.calculateTotalValue()));

            System.out.println();

            //displaying total warehouse inventory value
            System.out.println("Total Inventory Value: $" +
                    String.format("%.2f", calculateTotalInventoryValue(inventory)));

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    //calculates the total value of all products in the warehouse
    public static double calculateTotalInventoryValue(Product[] inventory) {
        double total = 0;

        for (Product item : inventory) {
            total += item.calculateTotalValue();
        }

        return total;
    }
}
