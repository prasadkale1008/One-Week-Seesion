import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LibrarySystem library = new LibrarySystem(10);

        while (true) {
            System.out.println("\nLibrary System Menu:");
            System.out.println("1. Add a Book Title");
            System.out.println("2. Remove a Book Title");
            System.out.println("3. Search for a Book Title");
            System.out.println("4. List All Book Titles");
            System.out.println("5. Sort Book Titles");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter book title to add: ");
                    String addTitle = scanner.nextLine();
                    library.addBookTitle(addTitle);
                    break;
                case 2:
                    System.out.print("Enter book title to remove: ");
                    String removeTitle = scanner.nextLine();
                    library.removeBookTitle(removeTitle);
                    break;
                case 3:
                    System.out.print("Enter book title to search: ");
                    String searchTitle = scanner.nextLine();
                    library.searchBookTitle(searchTitle);
                    break;
                case 4:
                    library.listAllBookTitles();
                    break;
                case 5:
                    library.sortBookTitles();
                    break;
                case 6:
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
