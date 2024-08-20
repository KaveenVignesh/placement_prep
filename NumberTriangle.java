public class NumberTriangle {
        public static void nNumberTriangle(int n) {
            int nu=1;
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(nu+" ");
                    nu=nu+1;
                }
                System.out.println();
            }
            }
    }

