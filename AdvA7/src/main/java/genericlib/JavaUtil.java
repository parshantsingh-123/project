package genericlib;
/**
 * @author Chandana N
 */
import java.util.Random;

public class JavaUtil {
/**
 * this below method is used to get random number
 * @return num
 */
	public int getRandomNumber() {
		Random random= new Random();
		int num = random.nextInt(1000);
		return num;
	}
}
