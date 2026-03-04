package Week02.Intro;

public class Person {
    private String name;
    private int age;
    private String email;
    private String[] phoneNumber;

    public Person(String name, int age, String email, String[] phoneNumber) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.phoneNumber = phoneNumber;

    }

    public void setName(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String[] getPhoneNumber() {
        return phoneNumber;
    }



    public static void main(String[] args) {
        String[] Numbers= new String[]{"111","222","333"};
        Person p=new Person("Tom",25,"Tom@uq.edu.au", Numbers );

//        Person p=new Person("Tom",25,"Tom@uq.edu.au", new String[]{"111","222","333"} );
//
//        System.out.println(p2.getName());



    }

}

