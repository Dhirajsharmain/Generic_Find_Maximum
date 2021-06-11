package bridgelabz;

import java.util.ArrayList;
import java.util.List;

public class GenericsFindMax <T extends Comparable<T>> {

    /**
     * Determines the largest of three or more parameter of any type.
     * @param x
     * @param <T>
     * @return
     */
    public <T extends Comparable<T>> T findMaximum(T... x) {
        T max = x[0];
        List<T> parameterArray = new ArrayList<T>();
        for (T element : x) {
            parameterArray.add(element);
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        System.out.println("Maximum of " + parameterArray.toString() + " is " + max);
        return max;
    }

    /**
     * Main method or Starting point of this program
     * @param args
     */
    public static void main(String[] args) {
        GenericsFindMax genericsFindMax = new GenericsFindMax();
        genericsFindMax.findMaximum(6,7,5,9);
        genericsFindMax.findMaximum(6.5,7.8,5.9,8.6);
        genericsFindMax.findMaximum("apple", "peach", "banana", "orange");
    }
}
