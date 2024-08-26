public class Characterprint {
  
        int count=1;
            void printGfg(int N) {
                if(count<=N){
                    System.out.print("GFG"+" ");
                    count++;
                    printGfg(N);
                }
                else return;
            }
        }

