package ru.mirea;

public class Head {
    public String color;
    public  String eye;
    public Head(String color1,String eye1){
        color=color1;
        eye=eye1;
    }

    @Override
    public String toString() {
        return "Head{" +
                "color='" + color + '\'' +
                ", eye='" + eye + '\'' +
                '}';
    }
}
