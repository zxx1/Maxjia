import java.util.Scanner;

/**
 * Created by zxx on 2017/8/24.
 */
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int S = getMaxArea(a);
            System.out.println(S);
        }
    }
    public static int getMaxArea(int h[]){
    int len =h.length;
    int max =0;
    for (int i=0;i<len;i++){
        int minh =h[i];
        for (int j=(i+1);j<len;j++){
            minh=Math.min(minh,h[j]);
            max=Math.max(max,(j+1-i)*minh);

        }
    }
return max;
    }
}
