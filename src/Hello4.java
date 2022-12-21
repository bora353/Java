import java.util.stream.IntStream;

public class Hello4 {
	public static void main(String[] args) {
	  

		
		IntStream intstream = IntStream.rangeClosed(1, 10);
		intstream.skip(3).limit(5).forEach(System.out::print);
		
		System.out.println();

		IntStream intStream2 = IntStream.rangeClosed(1,10);
		intStream2.filter(i->i%2==0 && i%3!=0).forEach(System.out::print);
		
	   	     
}
	}

	       
	    

		
		
					
				
				
				
				
			
		
	




