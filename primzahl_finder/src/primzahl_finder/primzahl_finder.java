package primzahl_finder;

public class primzahl_finder {

	public static void main(String[] args) {
				
		//*System.out.println("2");**//
		

			for(int i=10; i<=1000; i++){
				
			if(i==2) {
				System.out.println("2");
			}
				int x=i;
				int w;
			
				for(w=2; x%w!=0 && x/w!=1; w++){}
				
				int z=w;				
			
				if(x%z!=0) {
					System.out.println(x);
					
			}	
		}
			
	}
}
