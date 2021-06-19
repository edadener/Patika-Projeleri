
public class main {
    public static void main(String[] args) {
        int[] n = {1, 2};
        double result = 1.0;

        for (int i = 1; i < n.length; i++) {
            result = result+1.0/n[i];
        }
        System.out.println(result);
    }
}
