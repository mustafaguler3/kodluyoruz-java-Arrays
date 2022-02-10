public class main {
    public static void main(String[] args) {

        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};

        int max = list[0];
        int min = list[0];

        int closestMin = 0, closestMax = 0;


        for (int i : list) {
            if (i > max)
                max = i;
            if (i < min)
                min = i;
        }

        int difMax = max - list[0];
        int difMin = list[0] - min;

        for (int j = 0; j < list.length - 1; j++) {
            if (difMax >= (max - list[j])) {
                if (max - list[j] == 0)
                    continue;
                difMax = (max - list[j]);
                closestMax = list[j];
            }
            if (difMin >= (list[j] - min)) {
                if (list[j] - min == 0)
                    continue;
                difMin = list[j] - min;
                closestMin = list[j];
            }

        }
        System.out.println("Closest to Max is " + closestMax + "\nClosest to Min is " + closestMin);





    }
}
