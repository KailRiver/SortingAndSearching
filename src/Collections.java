import java.util.List;
import java.util.Comparator;

public class Collections {

    // Метод для универсального типа с использованием Comparable

    public static <T extends Comparable<? super T>> int binarySearch(List<T> list, T key) {
        return binarySearch(list, 0, list.size(), key);
    }

    public static <T extends Comparable<? super T>> int binarySearch(List<T> list, int fromIndex, int toIndex, T key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = low + ((high - low) / 2);

            int cmp = key.compareTo(list.get(mid));

            if      (cmp < 0) low = mid + 1;
            else if (cmp > 0) high = mid - 1;
            else             return mid;
        }

        return -(low + 1); // Если ключ не найден, возвращаем отрицательное значение
    }

    // Метод для универсального типа с использованием Comparator

    public static <T> int binarySearch(List<T> list, T key, Comparator<? super T> comparator) {
        return binarySearch(list, 0, list.size(), key, comparator);
    }

    public static <T> int binarySearch(List<T> list, int fromIndex, int toIndex, T key, Comparator<? super T> comparator) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = low + ((high - low) / 2);

            int cmp = comparator.compare(key, list.get(mid));

            if      (cmp < 0) low = mid + 1;
            else if (cmp > 0) high = mid - 1;
            else             return mid;
        }

        return -(low + 1); // Если ключ не найден, возвращаем отрицательное значение
    }
}