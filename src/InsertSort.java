public class InsertSort {
    /*Function to sort array using insertion sort*/
//        void sort(int arr[])
//        {
//            int n = arr.length;
//            for (int i = 1; i < n; ++i) {
//                int key = arr[i];
//                int j = i - 1;
//
//            /* Move elements of arr[0..i-1], that are
//               greater than key, to one position ahead
//               of their current position */
//                while (j >= 0 && arr[j] > key) {
//                    arr[j + 1] = arr[j];
//                    j = j - 1;
//                }
//                arr[j + 1] = key;
//            }
//        }

    public void insertSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int current = list[i];
            int index = i - 1;
            while (list[index] > current && index >= 0) {
                list[index + 1] = list[index];
                index--;
            }
            list[index+1]=current;

        }
    }
}
