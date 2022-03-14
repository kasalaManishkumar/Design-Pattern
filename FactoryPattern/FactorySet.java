package FactoryPattern;

class FactorySet implements Factory{
    public Set select(int setNo){
        if(setNo==1){
            return new SetA();
        }
        else if(setNo==2){
            return new SetB();
        }
        else{
            return new SetC();
        }
    }
}
