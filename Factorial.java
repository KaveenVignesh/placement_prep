class Factorial {
static ArrayList<Long> factorialNumbers(long n) {
    ArrayList<Long> factorialNumbers=new ArrayList<>();
    long result=1;
     for(long i=1;i<=n;i++){
         result*=i;
         if(result<=n) factorialNumbers.add(result);
         else break;
     }
     return factorialNumbers;
 
 }
}