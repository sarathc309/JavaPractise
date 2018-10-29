import java.util.Arrays;

public class HashTest {
    
    private String str;
    
    public HashTest(String str) {
        this.str = str;
    }
    
    @Override
    public String toString() {
        return this.str;
    }
        
    public static void main(String args[]) {
        HashTest h1 = new HashTest("2");        
        String s1 = new String("1");        
        
        Object arr[] = new Object[2];
        arr[0] = h1.toString();
        arr[1] = s1;
        Arrays.sort(arr);
        for (Object o : arr) {
            System.out.print(o + " ");
        }
    }
}