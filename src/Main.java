public class Main {
    /*
    Circularly Sorted Array
    An array is circularly sorted if the elements are sorted in ascending order, but displaced, or rotated,
     by any number of steps.

Complete the function/method that determines if the given array of integers is circularly sorted.
Examples
These arrays are circularly sorted (true):
[2, 3, 4, 5, 0, 1]       -->  [0, 1] + [2, 3, 4, 5]
[4, 5, 6, 9, 1]          -->  [1] + [4, 5, 6, 9]
[10, 11, 6, 7, 9]        -->  [6, 7, 9] + [10, 11]
[1, 2, 3, 4, 5]          -->  [1, 2, 3, 4, 5]
[5, 7, 43, 987, -9, 0]   -->  [-9, 0] + [5, 7, 43, 987]
[1, 2, 3, 4, 1]          -->  [1] + [1, 2, 3, 4]
While these are not (false):
[4, 1, 2, 5]
[8, 7, 6, 5, 4, 3]
[6, 7, 4, 8]
[7, 6, 5, 4, 3, 2, 1]
     */
    public class CircleSorted {
        public boolean vozr(int[] a)
        {
            for (int i = 0; i < a.length - 1; i++)
            {
                if (a[i] > a[i + 1]) return false;
            }
            return true;
        }
        public boolean isCircleSorted(int[] a) {
            //TODO
            int min = 0;
            for (int i = 1; i < a.length; i++)
            {
                if (a[i] < a[min]) min = i;
            }
            int [] a1 = new int[min];
            int [] a2 = new int[a.length - min];
            for (int i = 0; i < a1.length; i++)
            {
                a1[i] = a[i];
            }
            for (int i = 0; i < a2.length; i++)
            {
                a2[i] = a[i + min];
            }
            for (int i = 0; i < a1.length; i++)
            {
                if (a1[i] < a[min]) return false;
            }
            if (!vozr(a1)) return false;
            return vozr(a2);
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}