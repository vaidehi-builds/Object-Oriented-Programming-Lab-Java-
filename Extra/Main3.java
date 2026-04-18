package Extra;
class Book{
    String title;
    String ISBN;
    Book(String t, String isbn){
        title=t;
        ISBN=isbn;
    }
    void display(){
        System.out.println("Book title: "+title);
        System.out.println("ISBN: "+ISBN);
    }
}
class Journal extends Book{
    String subject;
    Journal(String t, String isbn,String sub){super(t,isbn); subject=sub;}
    @Override
    void display(){super.display(); System.out.println("Sunject: "+subject);}
    static boolean compare(Book b1, Book b2){
        if(b1 instanceof Journal && b2 instanceof Journal){
            Journal j1= (Journal) b1;
            Journal j2= (Journal) b2;
            return j1.subject.equalsIgnoreCase(j2.subject);
        }
        return false;
    }
}
class Novel extends Book{
    String genre;
    Novel(String t, String isbn, String g){super(t,isbn); genre=g;}
    @Override
    void display(){super.display(); System.out.println("Genre: "+genre);}
    static boolean compare(Book b1, Book b2){
        if(b1 instanceof Novel && b2 instanceof Novel){
            Novel n1= (Novel) b1;
            Novel n2= (Novel) b2;
            return n1.genre.equalsIgnoreCase(n2.genre);
        }
        return false;
    }
}
public class Main3 {
    public static void main(String[] args) {
        Journal[] journals = {
            new Journal("Science Today", "J001", "Physics"),
            new Journal("Bio World", "J002", "Biology"),
            new Journal("Advanced Physics", "J003", "Physics")
        };
        Novel[] novels = {
            new Novel("The Hobbit", "N001", "Fantasy"),
            new Novel("Harry Potter", "N002", "Fantasy"),
            new Novel("Sherlock Holmes", "N003", "Mystery")
        };
        System.out.println("Journals:");
        for (Journal j : journals) {
            j.display();
            System.out.println();
        }
        System.out.println("Novels: ");
        for (Novel n : novels) {
            n.display();
            System.out.println();
        }
        System.out.println("Compare Journal 1 & 3: " + Journal.compare(journals[0], journals[2]));
        System.out.println("Compare Novel 1 & 2: " + Novel.compare(novels[0], novels[1]));
    }
}

