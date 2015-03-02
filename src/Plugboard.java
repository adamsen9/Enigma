
public class Plugboard {
	String crosswire[] = {"HR","KV","JO","DU","EX","PZ","FC","GQ","TI","NA"};
	public char swap(char input) {
		
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 2; j++) {
				if(crosswire[i].charAt(j) == input) {
					if(input == crosswire[i].charAt(0)) {
						return crosswire[i].charAt(1);
					} else {
						return crosswire[i].charAt(0);
					}
							
				}
			}
		}
		return input;
	}
	
	public String getPlugs(){
		String str = "";
		for(int i = 0; i <= 9; i++) {
			str += crosswire[i] + ";";
		}
		return str;
	}
}
