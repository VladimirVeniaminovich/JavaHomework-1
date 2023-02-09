import java.util.Arrays;
public class TaskFive {
    public static void main(String[] args) {
        int[] doubleArr = {3,2,2,3};
        int val = 3;
        int temp;
        int[] arr = new int[4];
        for (int i = 0; i<doubleArr.length; i++) {
            for (int j = 1; j < doubleArr.length; j++) {
                if (doubleArr[i] == val & doubleArr[j] != val & i < j) {
                    temp = doubleArr[j];
                    doubleArr[j] = doubleArr[i];
                    doubleArr[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(doubleArr));
    }
}
