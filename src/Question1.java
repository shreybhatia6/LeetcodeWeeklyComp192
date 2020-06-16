
public class Question1 {

        public int[] shuffle(int[] nums, int n) {
            int [] arr = new int [n*2];
            int [] leftArr = new int [n];
            int [] rightArr = new int [n];
            int c = 0;

            for (int i = 0; i < n; i++){
                leftArr [i] = nums [i];
            }

            for (int z = n; z < nums.length; z++){

                rightArr [c] = nums [z];
                c++;
            }

            int b = 0;

            for (int k = 0; k < nums.length; k+=2){
                arr [k] = leftArr [b];
                arr [k+1] = rightArr [b];
                b++;
            }
            return arr;
        }
    }



