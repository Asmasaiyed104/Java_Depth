package Collection.Set.Project1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ColorSet {
    public static void main(String[] args) {

        Set<String> colorSet = new HashSet<>();
        colorSet.add("Red");
        colorSet.add("Blue");
        colorSet.add("Green");
        colorSet.add("Yellow");
        colorSet.add("Pink");

        System.out.println("Original colors    :");
        System.out.println("---------------------");

        displayColors(colorSet);


        Iterator<String> iterator = colorSet.iterator();

        while (iterator.hasNext()) {
            String color = iterator.next();
            if (color.equals("Blue")) {
                iterator.remove();
            }
        }


        replaceColor(colorSet, "Yellow", "Pink");

        System.out.println("Updated");
        System.out.println("---------------------");
        displayColors(colorSet);


        Set<String> sortCSet = createSortedColorSet(colorSet);

        System.out.println("TreeSet:");
        System.out.println("---------------------");
        displayColors(sortCSet);
    }


    public static void replaceColor(Set<String> colorSet, String oldColor, String newColor) {
        Iterator<String> iterator = colorSet.iterator();
        while (iterator.hasNext()) {
            String color = iterator.next();

            if (color.equals(oldColor)) {
                iterator.remove();
                colorSet.add(newColor);
                break;
            }
        }
    }


    public static Set<String> createSortedColorSet(Set<String> colorSet) {
        return new TreeSet<>(colorSet);
    }


    public static void displayColors(Set<String> colors) {
        for (String color : colors) {
            System.out.println(color);
        }
    }
}