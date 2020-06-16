import java.util.Arrays;

public class Question2 {
    public int[] getStrongest(int[] arr, int k) {

        int[] returnedArr = new int[arr.length];
        returnedArr = arr.clone();
        Arrays.sort(returnedArr);
        int[] finalArr = new int[k];
        int median = 0;

        if (arr.length % 2 != 0) {
            median = returnedArr[arr.length / 2];
        } else {
            median = returnedArr[(arr.length - 1) / 2];
        }

        int left = 0;
        int right = returnedArr.length - 1;
        int c = 0;
        while (c < k) {

            int leftTempVal = Math.abs(returnedArr[left] - median);
            int rightTempVal = Math.abs(returnedArr[right] - median);

            if (leftTempVal > rightTempVal) {
                finalArr[c] = returnedArr[left];
                left++;

            } else {
                finalArr[c] = returnedArr[right];
                right--;
            }

            c++;
        }
        return finalArr;
    }

}
