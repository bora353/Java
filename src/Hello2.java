import java.util.Arrays;

public class Hello2 {
	public static void main(String[] args) {
	   int n=24;
		 int[] answer = new int[n];
	        int num=0;
	        
	        for(int i=1; i<=n; i++){
	            if(n%i==0){
	                answer[num]=i;
	                num++;
	            }
	        }
	        
	        int[] answer2 = new int[num];
	        for(int i=0; i<num; i++){
	              answer2[i]=answer[i];
	        }
	        
	        System.out.println(Arrays.toString(answer));
	        System.out.println(Arrays.toString(answer2));
	   	     
}
	}

	       
	    

		
		
					
				
				
				
				
			
		
	




