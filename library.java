package Week3_Inheritance;

class Library {
    private LibraryItem[] items;
    private LibraryMember[] members;
    private int itemCount;
    private int memberCount;

    public Library() {
        items = new LibraryItem[100];
        members = new LibraryMember[50];
        itemCount = 0;
        memberCount = 0;
    }

    public void addItem(LibraryItem item) {
        items[itemCount] = item;
        itemCount++;
        System.out.println("Item added.");
    }

    public void addMember(LibraryMember member) {
        members[memberCount] = member;
        memberCount++;
        System.out.println("Member added.");
    }

    public LibraryItem findItem(int itemId) {
        for (int i = 0; i < itemCount; i++) {
            if (items[i].getItemId() == itemId) {
                return items[i];
            }
        }

        return null;
    }

    public LibraryMember findMember(int memberId) {
        for (int i = 0; i < memberCount; i++) {
            if (members[i].getMemberId() == memberId) {
                return members[i];
            }
        }

        return null;
    }

    public String toString() {
        String output = "\n--- LIBRARY ITEMS ---\n";

        if (itemCount == 0) {
            output += "No items in library.\n";
        } else {
            for (int i = 0; i < itemCount; i++) {
                output += items[i] + "\n\n";
            }
        }

        output += "--- LIBRARY MEMBERS ---\n";

        if (memberCount == 0) {
            output += "No members in library.\n";
        } else {
            for (int i = 0; i < memberCount; i++) {
                output += members[i] + "\n\n";
            }
        }

        return output;
    }
}
