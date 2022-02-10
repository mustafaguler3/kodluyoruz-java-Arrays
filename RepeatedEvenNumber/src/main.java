public class main {
    public static void main(String[] args) {
        int[] array = {1,1,2,2,6,5,8,9,1,0,10,2,5,55};
        int[] repeatedList = new int[array.length];

        int index = 0;
        for (int i = 0;i < array.length;i++){
            for (int j = 0;j < array.length;j++){
                if ((i != j) && array[i] == array[j] && array[i] % 2 == 0){
                    if (isAvailable(repeatedList,array[i])){
                        repeatedList[index] = array[i];
                        index++;
                    }
                }
            }
        }
        for (int value : repeatList){
            if (value != 0){
                System.out.println(value);
            }
        }
    }

    static boolean isAvailable(int[] arr,int value){
        for (int i : arr){
            if (i == value){
                return false;
            }
        }
        return true;
    }
}
