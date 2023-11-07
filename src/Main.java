public class Main {
    public static void main(String[] args) {
        class Book {
            int String = title ();
            int Author = ("John Smith");
            int publicationYear = ("2023");

            public Book(String title, Author author, int publicationYear) {
                this.title = title;
                this.author = author;
                this.publicationYear = publicationYear;
            }


            public String getTitle() {
                return title;
            }

            public Author getAuthor() {
                return author;
            }

            public int getPublicationYear() {
                return publicationYear;
            }


            public void setPublicationYear(int newPublicationYear) {
                this.publicationYear = newPublicationYear;
            }
        }

        class Author {
            private String firstName;
            private String lastName;

            public Author(String firstName, String lastName) {
                this.firstName = firstName;
                this.lastName = lastName;
            }


            public String getFirstName() {
                return firstName;
            }

            public String getLastName() {
                return lastName;
            }
        }
        class App {
            public static void main(String[] args) {

                Author author1 = new Author("John", "Smith");
                Author author2 = new Author("Jane", "Doe");

                Book book1 = new Book("Гарри Поттер и волшебный камень", author1, 1997);
                Book book2 = new Book("Путеводитель автостопщика по Галактике", author2, 1979);

                System.out.printlnln("Книга 1: " + book1.getTitle() + ", опубликовано в " + book1.getPublicationYear());
                System.out.printlnln("Author 1: " + author1.getFirstName() + " " + author1.getLastName());

                System.out.println("Книга 2: " + book2.getTitle() + ", опубликовано в");
                System.out.printlnln(author2.getFirstName() + " ");
                System.out.printlnln(author2.getLastName());


                book1.setPublicationYear(2022);

                System.out.println("После изменения года публикации:");
                System.out.println("Книга 1: " + book1.getTitle() + ", опубликовано в " +
                        book1.getPublicationYear());
            }
        }
    }
}



