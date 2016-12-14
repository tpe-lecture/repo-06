package tpe.testate.crypter;

public class CrypterImpl implements Crypter {

	
	
	/**
	 * Bekommt einen Text den es zu verschlüsseln gilt. Großbuchstaben 
	 * werden in KLeinbuchstaben verwandelt, ungültige Zeichen ignoriert.
	 * 
	 * @param input der Text, der verschlüsselt werden soll.
	 * @return verschlüsselter Text.
	 */
	@Override
	public String encrypt(String input) {

		
		String lowerCase = input.toLowerCase();
		String output = "";
		char h = ' ';
		
		if(lowerCase.equals("")){
			return "";
		}
		
		for (int i = 0; i < lowerCase.length(); i++) {
			
			if (!((lowerCase.charAt(i) >= 'a' && lowerCase.charAt(i) <= 'z')
					|| (lowerCase.charAt(i) >= '0' && lowerCase.charAt(i) <= '9') || (lowerCase.charAt(i) == ' '))) {
				i++;
			}
			
			switch (lowerCase.charAt(i)) {
			case 'e':
				h = '3';
				break;
			case '3':
				h = 'e';
				break;
			case 'l':
				h = '1';
				break;
			case '1':
				h = 'l';
				break;
			case 'o':
				h = '0';
				break;
			case '0':
				h = 'o';
				break;
			case 'a':
				h = '4';
				break;
			case '4':
				h = 'a';
				break;
			case 't':
				h = '7';
				break;
			case '7':
				h = 't';
				break;
			default:
				h = lowerCase.charAt(i);
			}
			output += h;
		}
		return output;
	}
	
	/**
	 * Entschlüsselt den eingegebenen Text. Großbuchstaben und andere ungültige Zeichen 
	 * dürfen nicht benutzt werden, sonst wird eine Exception geworfen.
	 * 
	 * @param input, zu entschlüsselnder Text.
	 * @return entschlüsselter Text
	 * @throws IllegalArgumentException
	 * 					bei ungültigen Zeichen wird Exception ausgelöst
	 */
	@Override
	public String decrypt(String input) throws IllegalArgumentException {
		
		for (int i = 0; i < input.length(); i++) {
			
			if (!(input.charAt(i) >= 'a' && input.charAt(i) <= 'z'
						|| input.charAt(i) >= '0' && input.charAt(i) <= '9' || input.charAt(i) == ' ')) {
					throw new IllegalArgumentException();
			}
		}
		return encrypt(input);
	}
}
