
package Week3_Inheritance;

class LibraryItem {
    private String title;
    private String creator;
    private int itemId;
    private boolean available;

    public LibraryItem(String title, String creator, int itemId){
        this.title = title;
        this.creator = creator;
        this.itemId = itemId;
        available = true;
    }
    //checkout method indicates that the item is not available therefore it is false.
    public void checkoutItem() {
        available = false;
    }
    //returnItem method returns the item making the item available
    public void returnItem() {
        available = true;
    }
    //isAvailable method return the boolean value if the item is available or not
    public boolean isAvailable() {
        return available;
    }
    //getItemId method returns int datatype for the itemId
    public int getItemId(){
        return itemId;
    }
    //toString method returns the string title
    public String toString(){
        return "ID: " + itemId
                + "\nTitle: " + title
                + "\nCreator: " + creator
                + "\nAvailable: " + available;
    }
}
