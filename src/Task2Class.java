
public class Task2Class {
	public static void result(String par) {
		String[] splitedValue = par.split(",");
		
		int first = Integer.parseInt(splitedValue[0]);
		int second = Integer.parseInt(splitedValue[1]);
		
		for(int i = 2; i <= first; i++) {
			for(int j = 1; j <= second; j++ ) {
				String s=Integer.toString(i);
				String x=Integer.toString(j);
				System.out.println(s + " X " + x + " = " +i * j);
			}
		}
	}
}
