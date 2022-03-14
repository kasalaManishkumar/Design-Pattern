package FactoryPattern;

public class Exam {
    public static void main(String[] args){
        int paperSet=1;
        FactorySet factorySet=new FactorySet();
        Set set=factorySet.select(paperSet);
        set.create();}
}
