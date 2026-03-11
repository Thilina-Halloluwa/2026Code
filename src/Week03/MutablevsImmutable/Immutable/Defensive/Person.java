package Week03.MutablevsImmutable.Immutable.Defensive;

public final class Person {

    private final String name;
    private final String[] phoneNumbers;

    public Person(String Name, String[] phoneNumbers) {
        this.name = Name;
        this.phoneNumbers = phoneNumbers.clone();
    }

    public String[] getPhoneNumbers() {
        return phoneNumbers.clone();
    }
}
