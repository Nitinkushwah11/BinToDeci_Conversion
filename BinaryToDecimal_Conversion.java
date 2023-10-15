import java.util.Scanner ;
public class BinaryToDecimal_Conversion {

    public static void binTodec(int binNum){
        int myNum=binNum;
        int pow=0;
        int  deciNum=0;

        while(binNum>0){
         int    lastDigit=binNum%10;
         deciNum=deciNum+(lastDigit*(int )Math.pow(2,pow));
         pow++;
         binNum=binNum/10;
        }
        System.out.println("Decimal of  " +myNum +" = "+ deciNum);
    }

    public static void main (String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter a your Binary Number : = ");
        int binNum=sc.nextInt();
        binTodec(binNum);

    }
    
}
