package negativos;

public class Controller {

	
	public int negativos(int[] num, int lenght) {
		if(lenght < 0) {
			return 0;
		} else if (num[lenght] < 0) {
			return 1 + negativos(num, lenght- 1);
		} else {
			return negativos(num, lenght-1);
		}
		
	}
	
	
	
}