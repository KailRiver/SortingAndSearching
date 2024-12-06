import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        testBinarySearchPrimitives();
        testBinarySearchObjectsWithComparable();
        testBinarySearchObjectsWithComparator();
    }

    private static void testBinarySearchPrimitives() {
        System.out.println("Testing binary search for primitives:");

        byte[] byteArray = {1, 2, 3, 4, 5};
        int indexByte = Arrays.binarySearch(byteArray, (byte) 3);
        System.out.println("Index of 3 in byteArray: " + indexByte);

        char[] charArray = {'a', 'b', 'c', 'd'};
        int indexChar = Arrays.binarySearch(charArray, 'c');
        System.out.println("Index of 'c' in charArray: " + indexChar);

        int[] intArray = {10, 20, 30, 40, 50};
        int indexInt = Arrays.binarySearch(intArray, 30);
        System.out.println("Index of 30 in intArray: " + indexInt);

        long[] longArray = {100L, 200L, 300L, 400L, 500L};
        int indexLong = Arrays.binarySearch(longArray, 300L);
        System.out.println("Index of 300L in longArray: " + indexLong);

        double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        int indexDouble = Arrays.binarySearch(doubleArray, 3.3);
        System.out.println("Index of 3.3 in doubleArray: " + indexDouble);

        float[] floatArray = {1.1f, 2.2f, 3.3f, 4.4f, 5.5f};
        int indexFloat = Arrays.binarySearch(floatArray, 3.3f);
        System.out.println("Index of 3.3f in floatArray: " + indexFloat);

        short[] shortArray = {1, 2, 3, 4, 5};
        int indexShort = Arrays.binarySearch(shortArray, (short) 3);
        System.out.println("Index of 3 in shortArray: " + indexShort);
    }

    private static void testBinarySearchObjectsWithComparable() {
        System.out.println("\nTesting binary search for objects with Comparable:");

        String[] stringArray = {"apple", "banana", "cherry", "date"};
        int indexString = Arrays.binarySearch(stringArray, "cherry");
        System.out.println("Index of \"cherry\" in stringArray: " + indexString);

        Integer[] integerArray = {10, 20, 30, 40, 50};
        int indexInteger = Arrays.binarySearch(integerArray, 30);
        System.out.println("Index of 30 in integerArray: " + indexInteger);

        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        int indexDoubleObject = Arrays.binarySearch(doubleArray, 3.3);
        System.out.println("Index of 3.3 in doubleArray: " + indexDoubleObject);

        Character[] characterArray = {'a', 'b', 'c', 'd'};
        int indexCharacter = Arrays.binarySearch(characterArray, 'c');
        System.out.println("Index of 'c' in characterArray: " + indexCharacter);

        List<String> stringList = new ArrayList<>(Arrays.asList("apple", "banana", "cherry", "date"));
        int indexStringList = Collections.binarySearch(stringList, "cherry");
        System.out.println("Index of \"cherry\" in stringList: " + indexStringList);

        List<Integer> integerList = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        int indexIntegerList = Collections.binarySearch(integerList, 30);
        System.out.println("Index of 30 in integerList: " + indexIntegerList);
    }

    private static void testBinarySearchObjectsWithComparator() {
        System.out.println("\nTesting binary search for objects with Comparator:");

        Comparator<String> stringLengthComparator = (s1, s2) -> Integer.compare(s1.length(), s2.length());

        String[] stringArray = {"apple", "banana", "cherry", "date"};
        int indexStringCustom = Arrays.binarySearch(stringArray, "date", stringLengthComparator);
        System.out.println("Index of \"date\" in stringArray with custom comparator: " + indexStringCustom);

        List<String> stringList = new ArrayList<>(Arrays.asList("apple", "banana", "cherry", "date"));
        int indexStringListCustom = Collections.binarySearch(stringList, "date", stringLengthComparator);
        System.out.println("Index of \"date\" in stringList with custom comparator: " + indexStringListCustom);
    }
}