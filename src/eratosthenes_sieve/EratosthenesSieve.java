package eratosthenes_sieve;

//エラトステネスの篩
//素数の数が1違う。１を入れて計算してるか？
public class EratosthenesSieve {
	public static void main(String[] args) {
		boolean[] bAry = new boolean[100];
		int calc = Integer.MIN_VALUE;
		int count = 2;
		for (int i = 1; i < bAry.length; i++) {
			if (bAry[i] == false) {
				while (calc < bAry.length) {
					calc = (i + 1) * count;
					try {
						bAry[calc - 1] = true;
					} catch (ArrayIndexOutOfBoundsException e) {
						break;
					}
					count++;
				}
				calc = Integer.MIN_VALUE;
				count = 2;
			}
		}
		int bCount = 0;
		for (boolean b : bAry) {
			if (!b)bCount++;
		}
		System.out.println(bCount);
	}
}
