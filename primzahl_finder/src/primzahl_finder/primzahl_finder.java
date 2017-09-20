package primzahl_finder;

public class primzahl_finder {

	public static void main(String[] args) {

		for(int i=2; i<=100; i++){
			
			int x=i;
			int w=2;
			
				for(int w=2; x%w>0 || x/w>1; w++){}
				
				int z=x/w;				/* w bekommen und x durch w teilen und dass erebniss als z deklarieren **/
			
				if(z==1) {
					System.out.println(x);
					
			}	
		}
	}
}
//test//