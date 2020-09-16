package ru.mirea;
public class Human{
Head HE = new Head("Black","small");
Leg LE = new Leg(43,50);
Hand HN = new Hand(5,47);
    public void cout(){
        System.out.println(HE);
        System.out.println(LE);
        System.out.println(HN);
    }
}