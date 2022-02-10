import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        int num;
        Scanner input = new Scanner(System.in);

        System.out.print("Size of array  :");
        num = input.nextInt();
        int [] list = new int[num];
        System.out.println("Enter the values of array  :");
        for(int i = 0 ; i < num ; i++){
            System.out.print(i+1 + ". value  :");
            list[i] = input.nextInt();
        }
        sortArray(list);

        System.out.println(Arrays.toString(list));

    }
    static int[] sortArray(int[] arr){

        for(int i = 0; i <arr.length; i++){
            for(int j = 0 ; j < arr.length-1; j++){
                if(arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        return arr;
    }
}
