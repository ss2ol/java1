
public class Mod {

	public static void main(String[] args) {
		int i = 0;
		while(true) {
			try {
				Thread.sleep(1000);			
			}catch(Exception e ) {}
			int mod = i % 5;
			if(mod == 0) {System.out.println ("빨");}
			if(mod == 1) {System.out.println ("주");}
			if(mod == 2) {System.out.println ("노");}
			if(mod == 3) {System.out.println ("초");}
			if(mod == 4) {System.out.println ("파");}
			i++;
		}

	}

}
