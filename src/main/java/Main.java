import org.exemple.SetUtil;

import java.util.Set;

public class Main {
    public static void main(String[] args) {

        System.out.println("First task. Demonstration of the work of the add method");

        Set<String> fruits = SetUtil.createFruitsSet();

        System.out.println("\nInitial data:");
        SetUtil.printFruits(fruits);

        SetUtil.updateFruits(fruits, "grape");

        System.out.println("\nUpdated data:");
        SetUtil.printFruits(fruits);

        fruits.clear();

        System.out.println("\nSecond task. Demonstration of the work of the remove method");

        fruits = SetUtil.createFruitsSet();

        System.out.println("Initial data:");
        SetUtil.printFruits(fruits);

        SetUtil.removeElement(fruits, "kiwi");

        System.out.println("\nUpdated data:");
        SetUtil.printFruits(fruits);
    }
}
