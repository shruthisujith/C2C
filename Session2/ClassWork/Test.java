import java.util.*;
class Test{
	public static int maxvalue(int [] array){
		int max=array[0];


    	for(int i=0; i<array.length; i++){
    		if(max<array[i]){
    			max=array[i];
    		}
    	}
    	return max;
	}//

    public static void main (String [] args){

    	int [] array= {10,20,50,2,100};

    	
        System.out.println(maxvalue(array));
    }
}
