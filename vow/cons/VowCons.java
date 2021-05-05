package vow.cons;


public class VowCons {

	public static void main(String[] args) {

		int v = 0, c = 0;
		String ll = "engine";
		ll = ll.toLowerCase();
		for (int i = 0; i <ll.length(); i++) {
			char ch = ll.charAt(i);



			if(ll.charAt(i) =='a'|| ll.charAt(i) =='e'|| ll.charAt(i) =='i'|| ll.charAt(i) =='o'|| ll.charAt(i) =='u'){
				v++;
			}
			else if((ch>='a' && ch<='z')){
				c++;
			}
			System.out.println("no of vowel are::"+ v);
			System.out.println("no of consonants are:: " + c);


		}}}


