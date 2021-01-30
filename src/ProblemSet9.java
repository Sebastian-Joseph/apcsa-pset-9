import java.util.Arrays;
import java.util.Collections;

public class ProblemSet9 {

    public int[] evenOdd(int[] arr, int n) {
        if (arr == null) {
            return null;
        }
        int[] a = new int[arr.length];
        int left = 0;
        int right = arr.length - 1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                a[left] = arr[i];
                left++;
            } else {
                a[right] = arr[i];
                right--;
            }
        }
        return a;
    }

    public int[] notAlone(int[] arr, int alone) {
        if (arr != null && arr.length > 0) {
            for (int i = 0; i < arr.length; i++) {
                if (i != 0 && i != arr.length - 1 && arr[i] != arr[i + 1] &&
                        arr[i] != arr[i - 1] && arr[i] == alone) {
                    if (arr[i] < arr[i - 1]) {
                        arr[i] = arr[i - 1];
                    }
                    if (arr[i] < arr[i + 1]) {
                        arr[i] = arr[i + 1];
                    }
                }
            }
            return arr;
        }
        return null;
    }

    public int[] shiftLeft(int[] arr) {
        if (arr == null) {
            return null;
        }
        if (arr.length == 0) {
            return arr;
        }
        int n = 1;
        for (int i = 0; i < n; i++) {
            int j, first;
            first = arr[0];
            for (j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[j] = first;
        }
        return arr;
    }

    public int[] fillIn(int start, int end) {
        int counter = 0;
        int[] output = new int[end - start];

        if (start <= end) {
            for (int i = start; i <= end - 1; i++) {
                output[counter] = i;
                counter++;
            }

        }
        return output;
    }

    public boolean triple(int[] arr) {
        if (arr == null) {
            return false;
        }
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    counter++;
                }
            }
        }
        if (counter == 3) {
            return true;
        } else {
            return false;
        }
    }

    public int pairs(int[] a, int[] b) {
        int n;
        if (a == null || b == null || a.length != b.length) {
            return -1;
        }
        int counter = 0;
        for (int i = 0; i < a.length; i++) {
            n = a[i] - b[i];
            if (n <= 2 && n >= -2 && n != 0) {
                counter++;
            }
        }
        return counter;
    }

    public boolean twentyFour(int[] arr) {
        if (arr == null) {
            return false;
        }
        boolean two = false;
        boolean four = false;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 2 && arr[i] == arr[i + 1]) {
                two = true;
            }
            if (arr[i] == 4 && arr[i] == arr[i + 1]) {
                four = true;
            }
        }

        if (two == true && four == true) {
            return false;
        } else if (two == true && four == false) {
            return true;
        } else if (two == false && four == true) {
            return true;
        } else {
            return false;
        }

    }

    public boolean fourteen(int[] arr) {
        if (arr == null) {
            return false;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1 && arr[i] == 4) {
                return true;
            }
        }

        return false;

    }

    public int centeredAverage(int[] arr) {
if(arr == null || arr.length < 3) {
    return -1;
}
int large = 0;
int small = 0;
for (int i = 1; i < arr.length; i++) {
    if (arr[i] > arr[large]) {
        large = i;
    }
    if (arr[i] < arr[small]) {
        small = i;
    }
}
int t = 0;
for (int a = 0; a < arr.length; a++) {
    if (a == large || a == small) {

    } else {
        t += arr[a];
    }
}
int average = t / ((arr.length)-2);
return average;
        }

        public int outliers ( int[] arr){
if (arr == null || arr.length < 1) {
    return -1;
}
int small = 0;
int large = 0;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > arr[large]) {
                    large = i;
                }
                if (arr[i] < arr[small]) {
                    small = i;
                }
            }
            int difference = arr[large] - arr[small];
            return difference;
        }
    }
