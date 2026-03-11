package Week02.Encapsulation;

public class Person {
    private String name;
    private int age;



    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    public static void main(String[] args) {
        Person p = new Person();

        p.setName("Jack");



        System.out.println(p.getName());


    }

}

