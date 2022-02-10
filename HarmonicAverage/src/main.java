public class main {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6};
        double sum = 0.0;

        for (int i = 0; i < numbers.length; i++){
            sum += 1/(1.0+numbers[i]);
        }

        double average = sum / numbers.length;

        System.out.println(average);


    }
}
