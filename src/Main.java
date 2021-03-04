public class Main {
    public static void main(String[] args) {
        int[] arrays = {1, 16, 3, 9, 7, 0, 4, 55,99};
        BubberSoft soft = new BubberSoft();
        soft.BubberSoft(arrays);
        for (int i : arrays) {
            System.out.println(i);
        }
    }

}
