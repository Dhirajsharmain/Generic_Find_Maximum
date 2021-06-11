package bridgelabz;

public class GenericsFindMax <T extends Comparable<T>> {

    /**
     * Determines the largest of three numbers.
     * @param x
     * @param y
     * @param z
     * @param <T>
     * @return
     */
    public <T extends Comparable<T>> T findMaximum(T x, T y, T z) {
        T max = x;

        if (y.compareTo(max) > 0)
            max = y;

        if (z.compareTo(max) > 0)
            max = z;

        return max;
    }

    /**
     * Main method or Starting point of this program
     * @param args
     */
    public static void main(String[] args) {
        GenericsFindMax genericsFindMax = new GenericsFindMax();
        genericsFindMax.findMaximum(6,7,5);
        genericsFindMax.findMaximum(6.5,7.8,5.9);
    }
}
