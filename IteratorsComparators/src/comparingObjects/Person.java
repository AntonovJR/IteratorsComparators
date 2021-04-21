package comparingObjects;

public class Person implements Comparable<Person> {
    private final String name;
    private final short age;
    private final String town;

    public Person (String name, short age, String town){
        this.name = name;
        this.age = age;
        this.town = town;
    }


    @Override
    public int compareTo(Person otherPerson) {
        int result = this.name.compareTo(otherPerson.name);
        if(result ==0){
            result = Short.compare(this.age,otherPerson.age);
            if(result == 0){
                result = this.town.compareTo(otherPerson.town);
            }
        }
        return result;
    }
}
