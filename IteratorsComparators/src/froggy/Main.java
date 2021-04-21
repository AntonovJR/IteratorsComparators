package froggy;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] stonesNumbers = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();

        String endWord = scanner.nextLine();
        Lake lake = new Lake(stonesNumbers);
        StringBuilder builder = new StringBuilder();
        Iterator it = lake.iterator();
        while (it.hasNext()) {
            builder.append(it.next()).append(", ");
        }
        System.out.println(builder.substring(0, builder.toString().lastIndexOf(", ")));
    }
}
