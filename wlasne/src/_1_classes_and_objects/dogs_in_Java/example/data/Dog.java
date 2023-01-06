package _1_classes_and_objects.dogs_in_Java.example.data;

public class Dog {
    private String name;
    private int age;

    public Dog() {
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean old() {
        boolean flag;
        if (age > 10) {
            flag = true;
        } else {
            flag = false;
        }
        return flag;
    }

    public void birthday(){
        age++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
