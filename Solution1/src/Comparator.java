public class Comparator {
    public boolean compare(int a, int b) {
        if (a == b) {
            return true;
        }
        return false;
    }

    public boolean compare(String a, String b) {
        if (a.equals(b)) {
            return true;
        }
        return false;
    }

    public boolean compare(int[] a, int[] b) {
        if (a.length == b.length){
            for (int i = 0; i < a.length ; i++) {
                if (a[i] == b[i]) {
                    return true;
                }
            }
        }
        return false;
    }
}
