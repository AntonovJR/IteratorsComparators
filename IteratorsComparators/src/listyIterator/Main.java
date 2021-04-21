package listyIterator;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> data = Arrays.stream(scanner.nextLine().split("\\s+"))
                .skip(1)
                .collect(Collectors.toCollection(ArrayList::new));
        String input = scanner.nextLine();
        ListyIterator listyIterator = new ListyIterator(data);
        while (!"END".equals(input)) {
            String[] tokens = input.split("\\s+");
            switch (tokens[0]) {
                case "Move":
                    System.out.println(listyIterator.move());
                    break;
                case "Print":
                    System.out.println(listyIterator.print());
                    break;
                case "HasNext":
                    System.out.println(listyIterator.iterator().hasNext());
                    break;
                case "PrintAll":
                    Iterator<String> iterator = listyIterator.iterator();
                    while(iterator.hasNext()){
                        System.out.print(iterator.next()+" ");
                    }
                    System.out.println();
                    break;
                default:
                    System.out.println("Invalid Operation!");
            }

            input = scanner.nextLine();
        }

    }
}
