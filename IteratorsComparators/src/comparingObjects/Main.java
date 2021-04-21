package comparingObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> personList = new ArrayList<>();
        String input = scanner.nextLine();
        while (!"END".equals(input)) {
            String[] tokens = input.split("\\s+");
            Person person = new Person(tokens[0], Short.parseShort(tokens[1]), tokens[2]);
            personList.add(person);

            input = scanner.nextLine();
        }
        int n = Integer.parseInt(scanner.nextLine());
        Person personForCompare = personList.get(n-1);
        personList.remove(personForCompare);
        short countEqual = 1;
        for(Person person: personList){
           if(person.compareTo(personForCompare) == 0){
               countEqual++;
           }

        }
        if(countEqual == 1){
            System.out.println("No matches");
        }else{
            System.out.print(countEqual + " " + (personList.size()-countEqual+1) + " " +  (personList.size()+1));
        }
    }
}
