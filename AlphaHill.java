public class AlphaHill {
    public static void alphaHill(int n) {
        for(int i=0;i<n;i++){
            int ch=65;
            int breakpoint=(2*i+1)/2;
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i+1;j++){
                System.out.print((char)ch+" ");
                if(j<=breakpoint) ch++;
                else ch--;
            }
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}