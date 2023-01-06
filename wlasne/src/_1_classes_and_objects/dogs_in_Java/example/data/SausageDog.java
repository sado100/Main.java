package _1_classes_and_objects.dogs_in_Java.example.data;

public class SausageDog extends Dog {
    private int length;

    public SausageDog() {
    }

    public SausageDog(String name, int age, int length) {
        super(name, age);
        this.length = length;
    }

    public void growth(int howMuch) {
        if(howMuch<=0){
            return;
        }else {
            length +=howMuch;
        }
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
