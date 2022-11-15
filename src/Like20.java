public class Like20 {
    public class CircleSorted {
        public boolean isCircleSorted(int[] a) {
            boolean pivot = false;
            for (int i=0; i < a.length; i++)
                if (a[i] > a[(i+1)%a.length])
                    if (pivot) return false; else pivot = true;
            return true;
        }
    }
}
