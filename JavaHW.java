
public class JavaHW {
    public static void main(String[] args){
        System.out.println("testers");
        int[] theArray = {14, 22, 7, 16, 47, 1, 31, 33};
        int[] nums = new int[5];
        nums[0] = 5;
        nums[1] = 3;
        nums[2] = 1;
        nums[3] = 2;
        nums[4] = 4;
        // System.out.println(theArray);
        // bubbleSort(theArray);
        bubbleSort(theArray);
        int[] sorted = insertionSort(nums);
        for(int x = 0; x < sorted.length; x++){
            System.out.println(sorted[x]);
        }
    }

    public static void bubbleSort(int[] array){
        for(int i = 0; i < array.length-1; i++){
            for(int k = 0; k < array.length-1; k++){
                if(array[k] > array[k+1]){
                   int temp = array[k];
                   array[k] = array[k+1];
                   array[k+1] = temp;
                }
            }
        }
        // return array;
        for(int n = 0; n < array.length; n++){
            System.out.println(array[n] + ", ");
        }
    }

    public static int[] insertionSort(int[] array){
        for(int i = 1; i < array.length; i++){
            int j = i;
            while(j > 0 && array[j] < array[j-1]){
                int temp = array[j-1];
                array[j-1] = array[j];
                array[j] = temp;
                j--;
            }
        }
        return array;
    }
   
}