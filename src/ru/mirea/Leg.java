package ru.mirea;

public class Leg {
public int size;
public int length;
    public Leg(int size1,int length1){
        size=size1;
        length=length1;
    }

    @Override
    public String toString() {
        return "Leg{" +
                "size=" + size +
                ", length=" + length +
                '}';
    }
}
