public class NumberCrown {
    public static void numberCrown(int n) {
       int s=2*(n-1);
       for(int i=1;i<=n;i++){
           for(int j=1;j<=i;j++){
               System.out.print(j+" ");
           }
           for(int j=1;j<=s;j++){
               System.out.print(" ");
           }
           for(int j=i;j>=1;j--){
               System.out.print(j+" ");
           }
           System.out.println();
           s-=2;
       }
    }
}