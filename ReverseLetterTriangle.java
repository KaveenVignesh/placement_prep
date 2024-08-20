public class ReverseLetterTriangle {
        public static void nLetterTriangle(int n) {
            for(int i=n;i>0;i--){
                int ch=65;
                for(int j=0;j<i;j++){
                    System.out.print((char)ch+" ");
                    ch++;
                }
                System.out.println();
            }
            }
    }
    

