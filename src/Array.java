import java.util.Arrays;
import java.util.Random;

public class Array {
    public static void main(String[] args) {
        int[] array = new int[10];
        /*int[] array = new int[]{3,1,6,7,3,6,8,4,3,2,4,1};
        int[] b = new int[array.length];

        b=array;
        b[0]++;

        System.out.println("Array:");
        System.out.println(Arrays.toString(array));
        System.out.println("b:");
        System.out.println(Arrays.toString(b));
*/

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            array[i] = random.nextInt(10,99);
        }
        System.out.println(Arrays.toString(array));

        // sort(array, array.length);
        //removeDuplicate(array);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
           // System.out.print(array[i] + " ");
            if(array[i]!=0){
                System.out.print(array[i] + " ");
            }
        }
    }

    public static void sort(int arr[], int n) {
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Elements after sorting : ");
        printArray(arr);
       /* System.out.println(" ");
        System.out.println("Third smallest number is: ");
        System.out.println(arr[2]);*/
    }

    public static void removeDuplicate(int arr[]) {
        sort(arr, arr.length);
        int[] temp = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j] = arr[i];
                j++;
            }
        }
        System.out.println("\nAfter removing duplicate elements from array: ");
        printArray(temp);
    }
}
