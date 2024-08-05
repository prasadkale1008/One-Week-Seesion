public class LibrarySystem {

    private String[] bookTitles;
    private int count;

    public LibrarySystem(int capacity) {
        this.bookTitles = new String[capacity];
        this.count = 0;
    }

  
    public void addBookTitle(String title) {
        if (count < bookTitles.length) {
            bookTitles[count] = title;
            count++;
            System.out.println("Book title added: " + title);
        } else {
            System.out.println("Library is full. Cannot add more titles.");
        }
    }

    
    public void removeBookTitle(String title) {
        int index = searchBookTitle(title);
        if (index != -1) {
            for (int i = index; i < count - 1; i++) {
                bookTitles[i] = bookTitles[i + 1];
            }
            bookTitles[count - 1] = null;
            count--;
            System.out.println("Book title removed: " + title);
        } else {
            System.out.println("Book title not found: " + title);
        }
    }

    
    public int searchBookTitle(String title) {
        for (int i = 0; i < count; i++) {
            if (bookTitles[i].equals(title)) {
                System.out.println("Book title found at index: " + i);
                return i;
            }
        }
        System.out.println("Book title not found: " + title);
        return -1;
    }

    
    public void listAllBookTitles() {
        if (count == 0) {
            System.out.println("No book titles in the library.");
        } else {
            System.out.println("Listing all book titles:");
            for (int i = 0; i < count; i++) {
                System.out.println((i + 1) + ". " + bookTitles[i]);
            }
        }
    }

    
    public void sortBookTitles() {
        for (int i = 0; i < count - 1; i++) {
            for (int j = i + 1; j < count; j++) {
                if (bookTitles[i].compareTo(bookTitles[j]) > 0) {
                    String temp = bookTitles[i];
                    bookTitles[i] = bookTitles[j];
                    bookTitles[j] = temp;
                }
            }
        }
        System.out.println("Book titles sorted alphabetically.");
    }
}
