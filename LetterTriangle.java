public class LetterTriangle {
    public static void nLetterTriangle(int n) {
        for(int i=0;i<n;i++){
             int ch=65;
            for(int j=0;j<=i;j++){
               
                System.out.print((char)ch+" ");
                ch=ch+1;
            }
            System.out.println();
        }
    }
}
