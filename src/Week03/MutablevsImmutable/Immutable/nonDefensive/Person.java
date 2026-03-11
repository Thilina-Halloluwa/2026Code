package Week03.MutablevsImmutable.Immutable.nonDefensive;

public final class Person {

    private final String name;
    private final String[] phoneNumbers;

    public Person(String name) {
        this.name = name;
        this.phoneNumbers = new String[]{"0412345678", "0498765432"};
    }

    public String getName() {
        return name;
    }

    public String[] getPhoneNumbers() {
        return phoneNumbers;
    }

}

class Main{
    public static void main(String[] args) {
        Person person = new Person("John");
        person.getPhoneNumbers()[0] = "999999";

        System.out.println(person.getPhoneNumbers()[0] );
    }
}