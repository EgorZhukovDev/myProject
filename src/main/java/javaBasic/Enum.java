package javaBasic;

public class Enum {
    public static void main(String[] args) {
        Days current = Days.MONDAY;
        System.out.println(current);    // MONDAY

        Book b1 = new Book("War and Peace", "L. Tolstoy", BookTypes.BELLETRE);
        System.out.printf("Book '%s' has a type %s", b1.name, b1.bookType);
//        Book b2 = new Book("Death souls", "N. Gogol", BookTypes.PHANTASY);



        switch(b1.bookType){
            case BELLETRE:
                System.out.println("Belletre");
                break;
            case SCIENCE:
                System.out.println("Science");
                break;
            case SCIENCE_FICTION:
                System.out.println("Science fiction");
                break;
            case PHANTASY:
                System.out.println("Phantasy");
                break;
        }
    }
}
class Book{

    String name;
    BookTypes bookType;
    String author;

    Book(String name, String author, BookTypes type){

        this.bookType = type;
        this.name = name;
        this.author = author;
    }
}

