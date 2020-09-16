package ru.mirea;

public class Hand {
    public int fingers;
    public int length;
    public Hand(int fingers1,int length1){
        fingers=fingers1;
        length=length1;
    }
    @Override
    public String toString() {
        return "Hand{" +
                "fingers=" + fingers +
                ", length=" + length +
                '}';
    }
}
