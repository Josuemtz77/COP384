package Week3_Inheritance;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Library library = new Library();

        int choice = 0;

        while (choice != 6) {
            System.out.println("\n1. Add item");
            System.out.println("2. Add member");
            System.out.println("3. Borrow item");
            System.out.println("4. Return item");
            System.out.println("5. Display library");
            System.out.println("6. Exit");
            System.out.print("Choice: ");

            choice = scnr.nextInt();
            scnr.nextLine();

            switch (choice) {
                case 1:

                    System.out.print("Enter title: ");
                    String title = scnr.nextLine();

                    System.out.print("Enter creator: ");
                    String creator = scnr.nextLine();

                    System.out.print("Enter item ID: ");
                    int itemId = scnr.nextInt();
                    scnr.nextLine();

                    System.out.print("Is it a book or a DVD (B/D): ");
                    char type = scnr.nextLine().toUpperCase().charAt(0);

                    if (type == 'B') {

                        System.out.print("Enter genre: ");
                        String genre = scnr.nextLine();

                        System.out.print("Enter number of pages: ");
                        int pages = scnr.nextInt();
                        scnr.nextLine();

                        Book book =
                                new Book(title, creator, itemId, genre, pages);
                        library.addItem(book);
                    }

                    else if (type == 'D') {

                        System.out.print("Enter director: ");
                        String director = scnr.nextLine();

                        System.out.print("Enter duration: ");
                        int duration = scnr.nextInt();
                        scnr.nextLine();

                        DVD dvd = new DVD(title, creator, itemId, director, duration);
                        library.addItem(dvd);
                    }

                    else {
                        System.out.println("Invalid item type.");
                    }

                    break;

                case 2:
                    System.out.print("Name: ");
                    String name = scnr.nextLine();

                    System.out.print("Address: ");
                    String address = scnr.nextLine();

                    System.out.print("Contact: ");
                    String contact = scnr.nextLine();

                    System.out.print("Member ID: ");
                    int memberId = scnr.nextInt();
                    scnr.nextLine();

                    LibraryMember member = new LibraryMember(name, address, contact, memberId);
                    library.addMember(member);
                    break;

                case 3:
                    System.out.print("Member ID: ");
                    int borrowMemberId = scnr.nextInt();

                    System.out.print("Item ID: ");
                    int borrowItemId = scnr.nextInt();
                    scnr.nextLine();

                    LibraryMember borrowMember = library.findMember(borrowMemberId);
                    LibraryItem borrowItem = library.findItem(borrowItemId);

                    if (borrowMember != null && borrowItem != null) {
                        borrowMember.borrowItem(borrowItem);
                    } else {
                        System.out.println("Member or item not found.");
                    }
                    break;

                case 4:
                    System.out.print("Member ID: ");
                    int returnMemberId = scnr.nextInt();

                    System.out.print("Item ID: ");
                    int returnItemId = scnr.nextInt();
                    scnr.nextLine();

                    LibraryMember returnMember = library.findMember(returnMemberId);
                    LibraryItem returnItem = library.findItem(returnItemId);

                    if (returnMember != null && returnItem != null) {
                        returnMember.returnItem(returnItem);
                    } else {
                        System.out.println("Member or item not found.");
                    }
                    break;

                case 5:
                    System.out.println(library);
                    break;

                case 6:
                    System.out.println("Program Ended");
                    break;

                default:
                    System.out.println("Invalid option.");
            }
        }

        scnr.close();
    }
}
