package stealthms.utilities;

public class Transliterator {
	public String translit(String text) {
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
