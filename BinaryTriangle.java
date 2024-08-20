public class BinaryTriangle {
    public static void nBinaryTriangle(int n) {
        for(int i=0;i<n;i++){
            int r=i%2==0?1:0;
            for(int j=0;j<=i;j++){
                System.out.print(r +" ");
                r=1-r;
            }
            System.out.println();
        }
    }
}