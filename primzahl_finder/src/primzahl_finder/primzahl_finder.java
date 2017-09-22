package primzahl_finder;

public class primzahl_finder {

	public static void main(String[] args) {
	  
	  System.out.println("2");

		for(int i=2; i<=20; i++){
			
			int x=i;
			int w;
			
				for(w=2; x%w!=0 && x/w!=1; w++){}
				
				int z=w;				/* w bekommen und x durch w teilen und dass erebniss als z deklarieren **/
			
				if(x%z!=0) {
					System.out.println(x);
					
			}	
		}
	}
}
//test//