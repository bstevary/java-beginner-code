import java.util.Scanner;

public class PrimeNumberAdd {
    public static void main(String[] args) {
        Scanner h = new Scanner(System.in);
        int upperLimit, results = 0,lowerLimit,primeNoCounter=0;
        String primeNumbers=" ";
        boolean isPrime;
        //valid implementation

        while (true) {
            System.out.println("Enter number range and note that upper limit and lower limit are included except cases " +
                    " where lower limit is less than 2(lower limit will start at two)");
            System.out.print("Enter lower limit :");
            lowerLimit = h.nextInt();
            if (lowerLimit >= 0)
              break;
             else
                System.out.println("lower limit should not be below 0");

        }
        while (true) {
            System.out.print("Enter upper limit:");
            upperLimit = h.nextInt();
            if (upperLimit <= lowerLimit)
                System.out.println("upper limit should not be equals or less than lower");
            else break;
        }

        for (int i = lowerLimit; i <= upperLimit; i++) {
                 //solving the bug caused by lower limit less than 2
                     while (i<=1){
                             i++;
                    }
                   isPrime = checkPrime(i);
                     if (isPrime) {
                         primeNoCounter++;
                         results+=i;
                         primeNumbers = primeNumbers + i + " ";
                     }
        }//upper loop


        System.out.println("The sum of prime numbers between"+" " + lowerLimit + " and" + " " + upperLimit+" ="
                + " "+results);
        System.out.println("There was " + primeNoCounter+ " occurrence of prime numbers \n which are"+primeNumbers);
    }

    static boolean checkPrime(int k){
        boolean isPrime=true;
        // to make the process faster divide by two k as the divisor is always below or equal to half
        for (int i = 2; i <= k/2; i++) {
            if(k%i==0) {
                isPrime=false;
                break;
            }
        }
        return isPrime;
    }
}

