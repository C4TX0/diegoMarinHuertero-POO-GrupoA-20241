public class Main {
    public static void main(String[] args) {

        //Person class

        Person person1 = new Person("Maria",19, "female");
        Person person2 = new Person("David",33, "male");
        Person person3 = new Person("Miguel",52, "male");
        Person person4 = new Person("Andrea",14, "female");

        person1.print();
        person2.print();
        person3.print();
        person4.print();

        System.out.println("########################################");

        //Book class

        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();
        Book book4 = new Book();

        book2.title = "El alquimista";
        book2.author = "Paulo Coelho";
        book2.year = 1988;

        book3.title = "Cien años de soledad";
        book3.author = "Gabriel García Márquez";
        book3.year = 1967;

        book4.title = "Harry Potter y la piedra filosofal";
        book4.author = "J.K. Rowling";
        book4.year = 1997;

        book1.print();
        book2.print();
        book3.print();
        book4.print();

        System.out.println("########################################");

        //Rectangle class

        Rectangle rectangle1 = new Rectangle(5,7);
        Rectangle rectangle2 = new Rectangle(8,4);
        Rectangle rectangle3 = new Rectangle(3,9);
        Rectangle rectangle4 = new Rectangle(4,6);

        System.out.print(rectangle1.area()+" ");
        System.out.println(rectangle1.perimeter());
        System.out.print(rectangle2.area()+" ");
        System.out.println(rectangle2.perimeter());
        System.out.print(rectangle3.area()+" ");
        System.out.println(rectangle3.perimeter());
        System.out.print(rectangle4.area()+" ");
        System.out.println(rectangle4.perimeter());


    }
}
