package tpe.testate.crypter;



public class CrypterImpl implements Crypter {



	@Override
	public String encrypt(String input) {

		int i = 0;
		int o = 0;

		String lowerCase = input.toLowerCase();


		String h = "";

		while (lowerCase.length() > i) {


		if(!(lowerCase.charAt(o)>='a'&&lowerCase.charAt(o)<='z' || lowerCase.charAt(o)>='0'&&lowerCase.charAt(o)<='9' || lowerCase.charAt(o)==' ')){
			throw new IllegalArgumentException();
		}
			switch (lowerCase.charAt(o)) {
			case 'e':
				h += '3';
				break;
			case '3':
				h += 'e';
				break;
			case 'l':
				h += '1';
				break;
			case '1':
				h += 'l';
				break;
			case 'o':
				h += '0';
				break;
			case '0':
				h += 'o';
				break;
			case 'a':
				h += '4';
				break;
			case '4':
				h += 'a';
				break;
			case 't':
				h += '7';
				break;
			case '7':
				h += 't';
				break;
			default:
				h += lowerCase.charAt(o);
			}






			i++;
			o++;

		}
		return h;
	}

	@Override
	public String decrypt(String input) throws IllegalArgumentException {
		if(input.equals(input.toLowerCase())){
			return encrypt(input);
		}else{
			throw new IllegalArgumentException();
		}

}
}
