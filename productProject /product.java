
public class Product {
    //declaring all attributes for the management system
    private double price;
    private int productID, quantity;
    private String name;


    //initializing constructor for all attributes
    public Product(double price, int quantity, int productID, String name){
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
        this.name = name;

    }

    public double calculateTotalValue(){
       return price * quantity;
    }


    //this calculates the stock amount the warehouse manager added to what is already in stock
    //
    public void restock(int amount){
        if (amount < 0){
            throw new IllegalArgumentException("Restock cannot be negative");
        }
        quantity += amount;
    }

    @Override
    public String toString(){
            return "Product ID: " + productID
                    + "\nName: " + name
                    + "\nQuantity: " + quantity
                    + "\nPrice: " + price
                    + "\nTotal Price: " + calculateTotalValue();
    }
    public void setProductID(int productID){
        this.productID = productID;
    }
    public int getProductID(){
        return productID;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setQuantity(int quantity){
        if(quantity < 0){
            throw new IllegalArgumentException("Quantity cannot be negative");
        }
        this.quantity = quantity;
    }
    public int getQuantity(){
        return quantity;
    }
    public void setPrice(double price) {
        if(price < 0){
            throw new IllegalArgumentException("Price cannot be negative");
        }
        this.price = price;
    }
    public double getPrice(){
        return price;
    }

}
class Electronics extends Product {
    private int warrantyPeriod;

    //constructor required for all subclasses extending the parent class
    public Electronics(double price, int quantity, int productID, String name, int warrantyPeriod) {
        super(price, quantity, productID, name);
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public double calculateTotalValue() {
        return super.calculateTotalValue() * 1.10;
    }
    @Override
    public String toString(){
        return super.toString()
                + "\nWarranty Period: " + warrantyPeriod + " months.";
    }
    public int getWarrantyPeriod(){
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(int warrantyPeriod){
        if(warrantyPeriod < 0){
            throw new IllegalArgumentException("Warranty period cannot be negative");
        }
        this.warrantyPeriod = warrantyPeriod;
    }


}

class Furniture extends Product {
    private String materialType;
    //constructor required for all subclasses extending the parent class
    public Furniture(double price, int quantity, int productID, String name, String materialType) {
        super(price, quantity, productID, name);
        this.materialType = materialType;
    }
    @Override
    public double calculateTotalValue(){
        return super.calculateTotalValue() * 1.05;
    }

    @Override
    public String toString(){
        return super.toString()
                + "\nMaterial Type: " + materialType;
    }
    public String getMaterialType(){
        return materialType;
    }

    public void setMaterialType(String materialType){
        this.materialType = materialType;
    }
}
