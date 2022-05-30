package prime_factorization;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//素因数分解
//5/30にやる。keepへ
public class PrimeFactorization {
	public static void main(String[] args) {
		Random rnd = new Random();
		int num = rnd.nextInt(1000)+1;
		int[] factAry = factorization(num);
		int ans = 1;
		for(int n:factAry) {
			ans*=n;
			System.out.print(n+",");
		}
		System.out.println("\n元数字："+ans);
	}
	public static int[] factorization(int num) {
		System.out.println("num="+num);
		List<Integer>intList = new ArrayList<>();
		boolean isLoop = true;
		int count = 2;
		while(isLoop) {
//			System.out.printf("num=%d,count=%d,list.size=%d\n",num,count,intList.size());
			if(num%count==0) {
				intList.add(count);
				num/=count;
				if(num==count)isLoop=false;
				continue;
			}
			if(num>count) {
				count++;
				continue;
			}else{
				if(num>1) {
					intList.add(num);
				}
			}
			isLoop=false;
		}
		return intList.stream().mapToInt(i->i).toArray();
	}
}
