
public class Task1Class {
	public static void input(int time) {
		int[] result = new int[time];
		for(int i = 0;i < result.length; i++) {
			result[i] = time * (i+1);
			String s=Integer.toString(i+1);
			String x=Integer.toString(time);
			System.out.println(x + " X " + s + " = "+ result[i]);
		}
	}
}
