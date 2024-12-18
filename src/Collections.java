import java.util.Comparator;
import java.util.List;

public class Collections {

    // Метод для поиска в списке с использованием естественного порядка
    public static <T> int binarySearch(List<? extends Comparable<? super T>> list, T key) {
        return binarySearch0(list, key);
    }

    // Метод для поиска в списке с использованием Comparator
    public static <T> int binarySearch(List<? extends T> list, T key, Comparator<? super T> c) {
        if (c == null) {
            // Если Comparator равен null, проверяем, что элементы списка реализуют Comparable
            if (list.isEmpty() || !(list.get(0) instanceof Comparable)) {
                throw new IllegalArgumentException("List elements must implement Comparable if no Comparator is provided.");
            }
            return binarySearch0((List<? extends Comparable<? super T>>) list, key);
        } else {
            return binarySearch0(list, key, c);
        }
    }

    // Основной метод бинарного поиска для списка с использованием естественного порядка
    private static <T> int binarySearch0(List<? extends Comparable<? super T>> list, T key) {
        int low = 0;
        int high = list.size() - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            Comparable<? super T> midVal = list.get(mid);
            int cmp = midVal.compareTo(key);

            if (cmp < 0)
                low = mid + 1;
            else if (cmp > 0)
                high = mid - 1;
            else
                return mid; // key found
        }
        return -(low + 1);  // key not found.
    }

    // Основной метод бинарного поиска для списка с использованием Comparator
    private static <T> int binarySearch0(List<? extends T> list, T key, Comparator<? super T> c) {
        int low = 0;
        int high = list.size() - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            T midVal = list.get(mid);
            int cmp = c.compare(midVal, key);

            if (cmp < 0)
                low = mid + 1;
            else if (cmp > 0)
                high = mid - 1;
            else
                return mid; // key found
        }
        return -(low + 1);  // key not found.
    }
}