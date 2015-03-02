
public class Reflector {
	String crosswire[] = {"KS","WP","CY","TD","RL","ZN","EJ","QV","AI","HU","MX","FB","OG"};
	
	public char swap(char input) {
		
		for(int i = 0; i < 13; i++) {
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
}
