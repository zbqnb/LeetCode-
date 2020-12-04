import java.util.Random;
import java.util.stream.IntStream;

public class BinarySearch {

    static final Random RANDOM = new Random();

    public static void main(String[] args) {
        final int size = 1_000_000;
        final int testRuns = 1_000_000;
        final int[] array = generateSortedArray(size);
        // run doNothing to trigger JIT/etc
        IntStream.range(0, 10_000_000).forEach(i -> {
            final int key = array[RANDOM.nextInt(array.length)];
            assert standard_binary_search(array, key) == boundless_quaternary_search(array, key);
        });
        // Start testing

        // Standard
        final long startStandard = System.nanoTime();
        IntStream.range(0, testRuns).forEach(i -> {
                    final int key = array[RANDOM.nextInt(size)];
                    int index = standard_binary_search(array, key);
                    // use the return value just in case
                    if (key != array[index]) {throw new RuntimeException("Invalid implementation");}
                }
        );
        final long durationStandard = System.nanoTime() - startStandard;

        // Quaternary
        final long startQuaternary = System.nanoTime();
        IntStream.range(0, testRuns).forEach(i -> {
                    final int key = array[RANDOM.nextInt(size)];
                    int index = boundless_quaternary_search(array, key);
                    // use the return value just in case
                    if (key != array[index]) {throw new RuntimeException("Invalid implementation");}
                }
        );
        final long durationQuaternary = System.nanoTime() - startQuaternary;

        // print result
        final long diff = durationStandard - durationQuaternary;
        System.out.printf("Absolute quaternary gaining average %d, percent %f", diff / testRuns, (diff * 1.f / durationStandard) * 100);
    }


    static int[] generateSortedArray(final int size) {
        final int[] array = new int[size];
        int previous = 0;
        int range = Integer.MAX_VALUE / size;
        for (int i = 0; i < size; i++) {
            array[i] = previous + RANDOM.nextInt(range);
            previous = array[i];
        }
        return array;
    }

    static int standard_binary_search(final int[] array, final int key) {
        int bot = 0;
        int i = array.length - 1;
        int mid;
        while (bot != i) {
            mid = i - (i - bot) / 2;
            if (key < array[mid]) {
                i = mid - 1;
            } else {
                bot = mid;
            }
        }
        if (key == array[i]) {
            return i;
        }
        return -1;
    }

    static int boundless_quaternary_search(final int[] array, final int key) {
        if (key < array[0]) {
            return -1;
        }
        int mid = array.length - 1;
        int i = mid;

        while (mid > 7) {
            mid /= 4;
            if (key < array[i - mid]) {
                i -= mid;
                if (key < array[i - mid]) {
                    i -= mid;
                    if (key < array[i - mid]) {
                        i -= mid;
                    }
                }
            }
        }

        while (key < array[i]) {
            --i;
        }

        if (key == array[i]) {
            return i;
        }
        return -1;
    }
}