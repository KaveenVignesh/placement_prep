public class AlphaRamp {
   
        public static void alphaRamp(int n) {
           int ch=65;

            for(int i=0;i<n;i++){
                for(int j=0;j<=i;j++){
                    System.out.print((char)ch+" ");
                }
                System.out.println();
                ch++;
            }
        }
    }

