
public class Codemachine {

	public static void main(String[] args) {
		
		//Plugboard
		
		//Rotor settings
		RotorBoard rotorBoard = new RotorBoard();
		Plugboard plugboard = new Plugboard();
		
		String input = "GRZHCTGZNGRZHCTGZNGRZHCTGZNGRZHCTGZN";
		//String manipulation
		
		input = input.replaceAll("\\s","");
		input = input.toUpperCase();
		
		char[] charArray = input.toCharArray();
		
		
		String str = "";
		for(int i = 0; i < charArray.length; i++) {
			str += plugboard.swap(rotorBoard.keypress(plugboard.swap(charArray[i])));
		}
		System.out.println(str);
		System.out.println(rotorBoard.getRotorState());
	}	
}
