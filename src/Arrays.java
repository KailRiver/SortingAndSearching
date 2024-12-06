 import java.util.Comparator;

    public class Arrays {

        // Методы для примитивных типов

        public static int binarySearch(byte[] a, byte key) {
            return binarySearch(a, 0, a.length, key);
        }

        public static int binarySearch(byte[] a, int fromIndex, int toIndex, byte key) {
            int low = fromIndex;
            int high = toIndex - 1;

            while (low <= high) {
                int mid = low + ((high - low) / 2);

                if (a[mid] < key) low = mid + 1;
                else if (a[mid] > key) high = mid - 1;
                else return mid;
            }

            return -(low + 1); // Если ключ не найден, возвращаем отрицательное значение
        }

        public static int binarySearch(char[] a, char key) {
            return binarySearch(a, 0, a.length, key);
        }

        public static int binarySearch(char[] a, int fromIndex, int toIndex, char key) {
            int low = fromIndex;
            int high = toIndex - 1;

            while (low <= high) {
                int mid = low + ((high - low) / 2);

                if (a[mid] < key) low = mid + 1;
                else if (a[mid] > key) high = mid - 1;
                else return mid;
            }

            return -(low + 1); // Если ключ не найден, возвращаем отрицательное значение
        }

        public static int binarySearch(double[] a, double key) {
            return binarySearch(a, 0, a.length, key);
        }

        public static int binarySearch(double[] a, int fromIndex, int toIndex, double key) {
            int low = fromIndex;
            int high = toIndex - 1;

            while (low <= high) {
                int mid = low + ((high - low) / 2);

                if (Double.compare(a[mid], key) < 0) low = mid + 1;
                else if (Double.compare(a[mid], key) > 0) high = mid - 1;
                else return mid;
            }

            return -(low + 1); // Если ключ не найден, возвращаем отрицательное значение
        }

        public static int binarySearch(float[] a, float key) {
            return binarySearch(a, 0, a.length, key);
        }

        public static int binarySearch(float[] a, int fromIndex, int toIndex, float key) {
            int low = fromIndex;
            int high = toIndex - 1;

            while (low <= high) {
                int mid = low + ((high - low) / 2);

                if (Float.compare(a[mid], key) < 0) low = mid + 1;
                else if (Float.compare(a[mid], key) > 0) high = mid - 1;
                else return mid;
            }

            return -(low + 1); // Если ключ не найден, возвращаем отрицательное значение
        }

        public static int binarySearch(int[] a, int key) {
            return binarySearch(a, 0, a.length, key);
        }

        public static int binarySearch(int[] a, int fromIndex, int toIndex, int key) {
            int low = fromIndex;
            int high = toIndex - 1;

            while (low <= high) {
                int mid = low + ((high - low) / 2);

                if (a[mid] < key) low = mid + 1;
                else if (a[mid] > key) high = mid - 1;
                else return mid;
            }

            return -(low + 1); // Если ключ не найден, возвращаем отрицательное значение
        }

        public static int binarySearch(long[] a, long key) {
            return binarySearch(a, 0, a.length, key);
        }

        public static int binarySearch(long[] a, int fromIndex, int toIndex, long key) {
            int low = fromIndex;
            int high = toIndex - 1;

            while (low <= high) {
                int mid = low + ((high - low) / 2);

                if (a[mid] < key) low = mid + 1;
                else if (a[mid] > key) high = mid - 1;
                else return mid;
            }

            return -(low + 1); // Если ключ не найден, возвращаем отрицательное значение
        }

// Методы для универсального типа с использованием Comparable

        public static <T extends Comparable<? super T>> int binarySearch(T[] a, T key) {
            return binarySearch(a, 0, a.length, key);
        }

        public static <T extends Comparable<? super T>> int binarySearch(T[] a, int fromIndex, int toIndex, T key) {
            int low = fromIndex;
            int high = toIndex - 1;

            while (low <= high) {
                int mid = low + ((high - low) / 2);

                int cmp = key.compareTo(a[mid]);

                if (cmp < 0) low = mid + 1;
                else if (cmp > 0) high = mid - 1;
                else return mid;
            }

            return -(low + 1); // Если ключ не найден, возвращаем отрицательное значение
        }

// Методы для универсального типа с использованием Comparator

        public static <T> int binarySearch(T[] a, T key, Comparator<? super T> comparator) {
            return binarySearch(a, 0, a.length, key, comparator);
        }

        public static <T> int binarySearch(T[] a, int fromIndex, int toIndex, T key, Comparator<? super T> comparator) {
            int low = fromIndex;
            int high = toIndex - 1;

            while (low <= high) {
                int mid = low + ((high - low) / 2);

                int cmp = comparator.compare(key, a[mid]);

                if (cmp < 0) low = mid + 1;
                else if (cmp > 0) high = mid - 1;
                else return mid;
            }

            return -(low + 1); // Если ключ не найден, возвращаем отрицательное значение
        }
    }
