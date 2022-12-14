import java.util.Random;

class Coin{
	private String Side ;
	public String ans() {
	final String a = "heads";
	final String b = "tails";
	Random rn = new Random();
	int rn2 = rn.nextInt(2);
	if(rn2 == 1) {
		Side = a;
	}else {
		Side = b;
	}

	return Side;
	}

}

public class Coin_Toss_Game {
	public static void main(String[] args) {
		Coin c= new Coin();
		String s = c.ans();
		System.out.println(s);
	}
}