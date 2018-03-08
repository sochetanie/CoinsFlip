import java.util.*;

public class CoinsFlip {
	static int h = 0;
	static int t = 0;
	
	public void Throw() {
		Random randomNum = new Random();
		int result = randomNum.nextInt(2);
		if (result == 0) {
			System.out.println("You got a Head");
			h++;
		}
		else {
			System.out.println("You got a Tail");
			t++;
		}
	}
	public static void main(String[] args) {
		int i;
		CoinsFlip Toss = new CoinsFlip();
		for(i = 1; i <= 10; i++) {
			Toss.Throw();
		}
		Result Flip = new Result(h, t, 10);
		Flip.FlipResult();
	}
}