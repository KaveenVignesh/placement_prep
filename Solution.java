public class Solution {
    public static void nStarTriangle(int n) {
        for(int i=1;i<=2*n-1;i++){
          
         int r=i>n?2*n-i:i;
            for(int j=1;j<=r;j++){
            System.out.print("*");
        }
        System.out.println();
    }
}
}