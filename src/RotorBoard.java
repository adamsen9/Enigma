
public class RotorBoard {
	Rotor rotorOne = new Rotor(0,1);
	Rotor rotorTwo = new Rotor(0,2);
	Rotor rotorThree = new Rotor(0,3);
	Reflector reflector = new Reflector();
	
	public RotorBoard(){
		
	}
	
	public char keypress(char input) {
		rotorOne.rotate();
		if(rotorOne.getPosition() >= 26) {
			rotorOne.setPosition(0);
			rotorTwo.rotate();
		} else if(rotorTwo.getPosition() >= 26) {
			rotorTwo.setPosition(0);
			rotorThree.rotate();
		} else if(rotorThree.getPosition() >= 26) {
			rotorThree.setPosition(0);
		}
		return rotorOne.backwardmap(rotorTwo.backwardmap(rotorThree.backwardmap(reflector.swap(rotorThree.forwardmap(rotorTwo.forwardmap(rotorOne.forwardmap(input)))))));
	}
	
	public String getRotorState(){
		return "" + rotorThree.getPosition() + "." + rotorTwo.getPosition() + "." + rotorOne.getPosition();
	}
}
