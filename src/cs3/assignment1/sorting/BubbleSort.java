package cs3.assignment1.sorting;


//2 9 5 4 8 1
public class BubbleSort {

    public static void sort(int[] list){

        for (int k = 1; k < list.length; k++) {
            for (int i = 0; i < list.length -k; i++) {
                if (list[i] > list[i + 1]){
                    list[i] = list[i+1];
                }
            }
        }
    }
}
