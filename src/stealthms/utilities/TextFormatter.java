package stealthms.utilities;

import stealthms.storage.OptionsStorage;

public class TextFormatter {
	public String translit(String text, boolean utf) {
		if (OptionsStorage.getTranslitStat() == 0) {
			if (utf==true) {
				return Utf2Ascii(text);
			} else {
				return text;
			}
		} else {
			StringBuffer sb = new StringBuffer();
			for (int i = 0; i < text.length(); i++) {
				char ch = text.charAt(i);
				switch (ch) {
				case '�':
					sb.append("a");
					break;
				case '�':
					sb.append("b");
					break;
				case '�':
					sb.append("v");
					break;
				case '�':
					sb.append("g");
					break;
				case '�':
					sb.append("d");
					break;
				case '�':
					sb.append("e");
					break;
				case '�':
					sb.append("yo");
					break;
				case '�':
					sb.append("zh");
					break;
				case '�':
					sb.append("z");
					break;
				case '�':
					sb.append("i");
					break;
				case '�':
					sb.append("i");
					break;
				case '�':
					sb.append("k");
					break;
				case '�':
					sb.append("l");
					break;
				case '�':
					sb.append("m");
					break;
				case '�':
					sb.append("n");
					break;
				case '�':
					sb.append("o");
					break;
				case '�':
					sb.append("p");
					break;
				case '�':
					sb.append("r");
					break;
				case '�':
					sb.append("s");
					break;
				case '�':
					sb.append("t");
					break;
				case '�':
					sb.append("u");
					break;
				case '�':
					sb.append("f");
					break;
				case '�':
					sb.append("h");
					break;
				case '�':
					sb.append("c");
					break;
				case '�':
					sb.append("ch");
					break;
				case '�':
					sb.append("sh");
					break;
				case '�':
					sb.append("sh");
					break;
				case '�':
					sb.append("'");
					break;
				case '�':
					sb.append("i");
					break;
				case '�':
					sb.append("'");
					break;
				case '�':
					sb.append("e");
					break;
				case '�':
					sb.append("yu");
					break;
				case '�':
					sb.append("ya");
					break;

				case '�':
					sb.append("A");
					break;
				case '�':
					sb.append("B");
					break;
				case '�':
					sb.append("V");
					break;
				case '�':
					sb.append("G");
					break;
				case '�':
					sb.append("D");
					break;
				case '�':
					sb.append("E");
					break;
				case '�':
					sb.append("YO");
					break;
				case '�':
					sb.append("ZH");
					break;
				case '�':
					sb.append("Z");
					break;
				case '�':
					sb.append("I");
					break;
				case '�':
					sb.append("I");
					break;
				case '�':
					sb.append("K");
					break;
				case '�':
					sb.append("L");
					break;
				case '�':
					sb.append("M");
					break;
				case '�':
					sb.append("N");
					break;
				case '�':
					sb.append("O");
					break;
				case '�':
					sb.append("P");
					break;
				case '�':
					sb.append("R");
					break;
				case '�':
					sb.append("S");
					break;
				case '�':
					sb.append("T");
					break;
				case '�':
					sb.append("U");
					break;
				case '�':
					sb.append("F");
					break;
				case '�':
					sb.append("H");
					break;
				case '�':
					sb.append("C");
					break;
				case '�':
					sb.append("CH");
					break;
				case '�':
					sb.append("SH");
					break;
				case '�':
					sb.append("SH");
					break;
				case '�':
					sb.append("'");
					break;
				case '�':
					sb.append("I");
					break;
				case '�':
					sb.append("'");
					break;
				case '�':
					sb.append("E");
					break;
				case '�':
					sb.append("YU");
					break;
				case '�':
					sb.append("YA");
					break;

				default:
					sb.append(ch);
				}
			}
			return sb.toString();
		}
	}

	public static char Byte2Char(int i){
		if (i < 0) i += 256;
		char c = (char)i;
		if (c == '\n') return c;
		if (c == '\r') return c;
		if (c == '\t') return c;
		if (c < ' ') return ' ';
		if (c < '\200') return c;
		if (i == 168) return '\u0401';
		if (i == 184) return '\u0451';
		if (i == 179) return '\u0456';
		if (i == 178) return '\u0406';
		if (i == 191) return '\u0457';
		if (i == 175) return '\u0407';
		if (i == 186) return '\u0454';
		if (i == 170) return '\u0404';
		if (i >= 192 && i <= 255) return (char)(i + 848);
		return ' ';
	}

	public static int Char2Byte(char c){
		char c1 = c;
		if (c == '\n') return c;
		if (c == '\r') return c;
		if (c == '\t') return c;
		if (c < ' ')   return 32;
		if (c < '\200') return c;
		if (c1 == '\u0401') return 168;
		if (c1 == '\u0451') return 184;
		if (c1 == '\u0456') return 179;
		if (c1 == '\u0406') return 178;
		if (c1 == '\u0457') return 191;
		if (c1 == '\u0407') return 175;
		if (c1 == '\u0454') return 186;
		if (c1 == '\u0404') return 170;
		if (c1 >= '\u0410' && c1 <= '\u044F') return c1 - 848;
		return 32;
	}

	public static String Ascii2Utf(String s){
		String s1 = "";
		try {
			byte abyte0[] = s.getBytes();
		for (int i = 0; i < abyte0.length; i++) s1 = s1 + String.valueOf(Byte2Char(abyte0[i]));
		} catch (Exception exception){
			s1 = "";
		}
		return s1;
	}

	public static String Utf2Ascii(String s){
		String s1 = "";
		try {
			char ac[] = s.toCharArray();
			for(int i = 0; i < ac.length; i++) s1 = s1 + (char)Char2Byte(ac[i]);
		} catch (Exception exception){
			s1 = "";
		}
		return s1;
	}

}