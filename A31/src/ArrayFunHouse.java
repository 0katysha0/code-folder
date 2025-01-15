import java.util.Arrays;

public class ArrayFunHouse {

    public static void main(String args[]) {
        int[] one = {7, 4, 10, 0, 1, 7, 6, 5, 3, 2, 9, 7};

        System.out.println("Array One: " + Arrays.toString(one));

        System.out.println("sum of spots 3-6  =  " + getSum(one, 3, 6));
        System.out.println("sum of spots 2-9  =  " + getSum(one, 2, 9));

        System.out.println("# of 7s  =  " + getCount(one, 7));
        System.out.println("# of 9s  =  " + getCount(one, 9));

        int[] withoutSevens = removeVal(one, 7);
        System.out.println("Array One without 7s: " + Arrays.toString(withoutSevens));

        int[] two = {7, 4, 2, 7, 3, 4, 6, 7, 8, 9, 7, 0, 10, 7, 0, 1, 7, 6, 5, 7, 3, 2, 7, 9, 9, 8, 7};

        System.out.println("Array Two: " + Arrays.toString(two));

        System.out.println("# of 4s  =  " + getCount(two, 4));
        System.out.println("# of 9s  =  " + getCount(two, 9));

        int[] withoutSevensTwo = removeVal(two, 7);
        System.out.println("Array Two without 7s: " + Arrays.toString(withoutSevensTwo));
    }

    public static int getSum(int[] numArray, int start, int stop) {
        int sum = 0;
        for (int i = start; i < stop && i < numArray.length; i++) {
            sum += numArray[i];
        }
        return sum;
    }

    public static int getCount(int[] numArray, int val) {
        int count = 0;
        for (int num : numArray) {
            if (num == val) {
                count++;
            }
        }
        return count;
    }


    public static int[] removeVal(int[] numArray, int val) {
        int count = 0;
        for (int num : numArray) {
            if (num != val) {
                count++;
            }
        }
        
        int[] newArray = new int[count];
        int index = 0;

        for (int num : numArray) {
            if (num != val) {
                newArray[index++] = num;
            }
        }
        
        return newArray;
    }
}
