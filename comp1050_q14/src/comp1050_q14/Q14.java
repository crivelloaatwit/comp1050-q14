package comp1050_q14;

public class Q14 {

	public static <E extends Comparable<E>> E min(E[] l)
	{
		E m = null;
		for(E v : l)
		{
			if (m == null || v.compareTo(m)<0)
			{
				m = v;
			}
		}
		return m;
	}

	public static void main(String[] args) {
		Double[] ds = {1.,3.,2.7,3.14};
		String[] ss = {"a","b","c"};
		
		System.out.printf("%s%n", min(ds));
		System.out.printf("%s%n", min(ss));

	}

}
