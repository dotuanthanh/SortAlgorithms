public class BubberSoft implements Sort {
    public BubberSoft(){}
    public int[] BubberSoft(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length-i ; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j ] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }

    @Override
    public BubberSoft getSort() {
        return null;
    }
}

