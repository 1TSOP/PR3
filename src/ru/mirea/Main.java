package ru.mirea;

public class Main {
    public static void main(String[] args) {
        //Circle
        /*
    public static void main(String[] args) {
        Circle c1 = new Circle(2.0, "blue");
        System.out.println("Radius is " + c1.getRadius()
                +  " Color is " + c1.getColor()
                +  " Area is " + c1.getArea());

        Circle c2 = new Circle(2.0);
        System.out.println("Radius is " + c2.getRadius()
                + " Color is " + c2.getColor()
                + " Area is " + c2.getArea());

        Circle c3 = new Circle();
        System.out.println("Radius is " + c3.getRadius()
                + " Color is " + c3.getColor()
                + " Area is " + c3.getArea());

     */
        //Human
        /*
    Human HM= new Human();
        Head HE = new Head("Black","Brown");
        Leg LE = new Leg(43,50);
        Hand HN = new Hand(5,47);
        System.out.println(HE);
        System.out.println(LE);
        System.out.println(HN);
         */
        //Book
        Book book = new Book("Postnov", "Java", 2020, 750, "MIREA");
        System.out.println(book.toString());

    }
}
