package Week3_Inheritance;

class LibraryMember {
    private String name;
    private String address;
    private String contact;
    private int memberId;
    private LibraryItem[] borrowedItems;
    private double fines;
    private int borrowedCount;

    public LibraryMember(String name, String address, String contact, int memberId) {
        this.name = name;
        this.address = address;
        this.contact = contact;
        this.memberId = memberId;
        borrowedItems = new LibraryItem[10];
        borrowedCount = 0;
        fines = 0.0;
    }

    public int getMemberId() {
        return memberId;
    }

    public void borrowItem(LibraryItem item) {
        if (item.isAvailable() && borrowedCount < borrowedItems.length) {
            borrowedItems[borrowedCount] = item;
            borrowedCount++;
            item.checkoutItem();
            System.out.println("Item borrowed.");
        } else {
            System.out.println("Item is unavailable or borrow limit reached.");
        }
    }

    public void returnItem(LibraryItem item) {
        for (int i = 0; i < borrowedCount; i++) {
            if (borrowedItems[i].getItemId() == item.getItemId()) {
                borrowedItems[i] = borrowedItems[borrowedCount - 1];
                borrowedItems[borrowedCount - 1] = null;
                borrowedCount--;
                item.returnItem();
                System.out.println("Item returned.");
                return;
            }
        }

        System.out.println("This member did not borrow that item.");
    }

    public String toString() {
        String output = "Member ID: " + memberId
                + "\nName: " + name
                + "\nAddress: " + address
                + "\nContact: " + contact
                + "\nFines: $" + fines
                + "\nBorrowed Items:";

        if (borrowedCount == 0) {
            output += "\nNone";
        } else {
            for (int i = 0; i < borrowedCount; i++) {
                output += "\n" + borrowedItems[i];
            }
        }

        return output;
    }
}
