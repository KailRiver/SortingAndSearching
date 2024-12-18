public class Main {
    public static void main(String[] args) {
        // Тестирование класса Arrays
        testArrays();
    }

    private static void testArrays() {
        System.out.println("Тестирование класса Arrays:");

        // Тест для массива char
        char[] charArray = {'a', 'b', 'c', 'd', 'e'};
        System.out.println("binarySearch(charArray, 'c'): " + Arrays.binarySearch(charArray, 'c')); // Ожидаемый результат: 2
        System.out.println("binarySearch(charArray, 'f'): " + Arrays.binarySearch(charArray, 'f')); // Ожидаемый результат: -6

        // Тест для массива int
        int[] intArray = {10, 20, 30, 40, 50};
        System.out.println("binarySearch(intArray, 30): " + Arrays.binarySearch(intArray, 30)); // Ожидаемый результат: 2
        System.out.println("binarySearch(intArray, 35): " + Arrays.binarySearch(intArray, 35)); // Ожидаемый результат: -4
    }
}