
public class Codemachine {

	public static void main(String[] args) {
		
		//Plugboard
		
		//Rotor settings
		RotorBoard rotorBoard = new RotorBoard();
		Plugboard plugboard = new Plugboard();
		//String manipulation

		System.out.println(code("QOSOLPTABQHXQGMOEPXHNEFXOYBZXSNKEXPFJGRMNPNNKE",plugboard,rotorBoard));
		
	}	
	
	public static String code(String input, Plugboard plugboard, RotorBoard rotorBoard){
		input = input.replaceAll("\\s","");
		input = input.toUpperCase();
		
		char[] charArray = input.toCharArray();
		String output = "";
		for(int i = 0; i < charArray.length; i++) {
			output += plugboard.swap(rotorBoard.keypress(plugboard.swap(charArray[i])));
		}

		return output;
	}
}
