package sample2.w12;

public class Reverse {
	public static void main(String[] args) {
		String str1 = "!edoc doog ";
		String str2 = "a tahW";
		StringBuilder sb = new StringBuilder(str1.concat(str2));
		sb.reverse();
		System.out.println(sb);
	}
}
