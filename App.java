public class App {
    public static void main(String[] args) throws Exception {
        int[] array = new int[]{
            1, 3, 1, 5, 7, 7, 3, 2, 5, 7
        };
        task1(array);
        
    }


    public static void task1(int[] array) {
        // Реализовать сортировку подсчетом
        // Она заключается в подсчете количества вхождений элементов в массив и восстановление по этой информации.
        // [1, 3, 1, 5, 7, 7, 3, 2, 5, 7]
        // 1 -> 2
        // 2 -> 1
        // 3 -> 2
        // 5 -> 2
        // 7 -> 3
        // [1, 1, 2, 3, 3, 5, 5, 7, 7, 7]
        int max = maxV(array);
        int[] ncount = new int[max+1];

        for (int i : array) {
            ncount[i] ++;
        }
        int[] sorted = new int[array.length];
        int index = 0;
        for (int i = 0; i < ncount.length; i++) {
            for (int j = 0; j < ncount[i]; j++) {
                sorted[index] = i;
                index++;
            }
        }
        for (int i = 0; i < sorted.length; i++) {
            System.out.print(sorted[i] + " ");
        }
    }
    
    private static int maxV(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        return max;
    }
}
