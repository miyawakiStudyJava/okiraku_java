package fizzbuzz;

//1 から 100 までの値を表示するとき、]
//3 の倍数のときは Fizz を、5 の倍数ときは Buzz を表示する
public class FizzBuzz {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("");
		for (int i = 0; i < 100; i++) {
			sb = new StringBuilder("");
			if ((i + 1) % 3 == 0) {
				sb.append("Fizz");
			}
			if ((i + 1) % 5 == 0) {
				sb.append("Buzz");
			}
			if (sb.toString().equals("")){
				sb.append(i+1);
			}
			System.out.println(sb);

		}
	}
}
