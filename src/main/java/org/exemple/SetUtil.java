package org.exemple;

import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public class SetUtil {
    public static void FillFruitsSet(Set<String> fruits) {
        fruits.add("orange");
        fruits.add("apple");
        fruits.add("kiwi");
        fruits.add("strawberry");
        fruits.add("mango");
    }

    public static void updateFruits(Set<String> fruits, String newFruit) {
        fruits.add(newFruit);
    }

    public static void removeElement(Set<String> fruits, String element) {
        System.out.println("\nElement \"" + element + "\" " + (fruits.remove(element) ? "has been removed." : "is not present in the set."));
    }


    public static void printFruits(Set<String> fruits) {
        AtomicInteger count = new AtomicInteger(1);
        fruits.forEach(fruit -> System.out.println(count.getAndIncrement() + ") " + fruit));
    }
}
