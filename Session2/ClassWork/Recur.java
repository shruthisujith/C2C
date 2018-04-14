import java.util.*;
class Recur{
	/*public static int fact(int n){
        if(n==1){
            return 1;
        }
		return n*fact(n-1);
	}//
    public static int fact1(int n){
       int i,val=1;
       for(i=1;i<=n;i++){
            val=val*i;
       }
       return val;
    } */

    public static int[] recursion(int n){
        int[] recurArray = new int[n];
        recurArray[0]=1;
        int i;
        for(i=1; i<n; i++){
            recurArray[i]= recurArray[i-1]*(i+1)%10000000;
        }
        return recurArray;
    }

    public static void main (String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter n");

        int n= sc.nextInt();
        int []array= new int[n];
        int i=0;
        System.out.println("Enter numbers");

        while(i!=n){
            array[i]=sc.nextInt();
            i++;
        }
        int max= Test.maxvalue(array);
        System.out.println("max:"+max);
        int[] maxarray = recursion(max);
        i=0;
        int j;
        while(i!=n){
            j=array[i];
            System.out.println(maxarray[j-1]);
            i++;
        }
        //System.out.println(fact1(n));
    }
}
