package primeNumber;

import java.util.ArrayList;
import java.util.List;

//素数を求める
public class PrimeNumber {
	public static void main(String[] args) {
		Prime pn = new Prime();
		int[] ary = pn.createPrimeAry();
		System.out.println("素数の数："+ary.length);
		for(int n:ary) {
			System.out.print(n+",");
		}
	}
}
class Prime{
	int[] createPrimeAry(){
		List<Integer>primeList = new ArrayList<>();
		primeList.add(2);
		primeList.add(3);
		int len = 1000;
		boolean isPrime=true;
		for(int i=4;i<len;i++) {
			for(int n:primeList) {
				if(i%n==0) {
					isPrime=false;
					break;
				}
			}
			if(isPrime) {
				primeList.add(i);
			}
			isPrime=true;
		}
		return primeList.stream().mapToInt(i->i).toArray();
	}
}