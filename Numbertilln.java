public class Numbertilln
{
    int count=1;
  public void printNos(int N)
    {
     if(count<=N) {
        System.out.print(count+" ");
        count++;
        printNos(N);
     }
        else return;
    }
} 
