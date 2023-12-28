public class BubbleSort {
    static int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
    public static void bubbleSort(int[] list) {
        boolean neednextPass = true;

        for (int i = 1; i < list.length && neednextPass; i++) {
            neednextPass = false;
            for (int j = 0; j < list.length-i; j++) {
                if (list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                    neednextPass = true;
                }
            }
        }
    }
    public static void main(String[] args) {
        bubbleSort(list);
        for (int j : list) System.out.print(j + " ");
    }
}
