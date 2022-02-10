public class main {
    public static void main(String[] args) {

        int[] numbers = {12,4,6,32,21,9,3};
        double sum=0.0;

        for (int i=0;i<numbers.length;i++){
            sum+=1/(1.0+numbers[i]);
        }

        double average = sum / numbers.length;

        System.out.println(average);


    }
}
