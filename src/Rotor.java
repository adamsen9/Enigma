
public class Rotor {
	int position;
	
	String forwardcrosswire = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String backwardcrosswire;

	//
	
	public Rotor(int position, int rotortype){
		this.position = position;
		if(rotortype == 1) {
			this.backwardcrosswire = "ZOWQYNXFDJIESHKGAMBLRPVTUC";
		}
		if(rotortype == 2) {
			this.backwardcrosswire = "RKHQTZPYLNWJAMFGXVBCOSUIED";
		}
		if(rotortype == 3) {
			this.backwardcrosswire = "ALSUNKBEPVIDQJOXRFWCTMHYGZ";
		}
	}
	
	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position = position;
	}
	public void rotate(){
		position++;
	}
	
	public char forwardmap(char input){
		char output;
		int register = input - 65 + position;
		if(register >= 26) {
			register -= 26;
		}
		output = backwardcrosswire.charAt(register);
		return output;
	}
	
	public char backwardmap(char input) {
		int register;
		for(int i = 0; i < 26; i++) {
			if(backwardcrosswire.charAt(i) == input) {
				register = i - position;
				if(register < 0) {
					register += 26;
				}
				char output =  forwardcrosswire.charAt(register);
				return output;
			}
		}
		return 'Å';
	}
}

