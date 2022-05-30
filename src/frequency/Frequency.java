package frequency;

public class Frequency {
	public static void main(String[] args) {
		Height h = new Height();
		double[] heightAry = h.create();
		int[] intAry = h.counter(heightAry);
		int start = 130, end = 170, sa = 5;
		int count = 0, total = 0;
		System.out.println("  階級  度数 累積度数 ");
		System.out.println("----------------------");
		for (int i = start; i < end; i += sa) {
			total += intAry[count];
			System.out.printf("%d-%d %3d    %3d\n", i, i + sa, intAry[count], total);
			count++;
		}

	}
}

class Height {
	public double[] create() {
		double[] height = {
				148.7, 149.5, 133.7, 157.9, 154.2, 147.8, 154.6, 159.1, 148.2, 153.1,
				138.2, 138.7, 143.5, 153.2, 150.2, 157.3, 145.1, 157.2, 152.3, 148.3,
				152.0, 146.0, 151.5, 139.4, 158.8, 147.6, 144.0, 145.8, 155.4, 155.5,
				153.6, 138.5, 147.1, 149.6, 160.9, 148.9, 157.5, 155.1, 138.9, 153.0,
				153.9, 150.9, 144.4, 160.3, 153.4, 163.0, 150.9, 153.3, 146.6, 153.3,
				152.3, 153.3, 142.8, 149.0, 149.4, 156.5, 141.7, 146.2, 151.0, 156.5,
				150.8, 141.0, 149.0, 163.2, 144.1, 147.1, 167.9, 155.3, 142.9, 148.7,
				164.8, 154.1, 150.4, 154.2, 161.4, 155.0, 146.8, 154.2, 152.7, 149.7,
				151.5, 154.5, 156.8, 150.3, 143.2, 149.5, 145.6, 140.4, 136.5, 146.9,
				158.9, 144.4, 148.1, 155.5, 152.4, 153.3, 142.3, 155.3, 153.1, 152.3
		};
		return height;
	}

	public int[] counter(double[] heightAry) {
		int[] fAry = new int[8];
		for (double d : heightAry) {
			if (d >= 165) {
				fAry[7]++;
			} else if (d >= 160) {
				fAry[6]++;
			} else if (d >= 155) {
				fAry[5]++;
			} else if (d >= 150) {
				fAry[4]++;
			} else if (d >= 145) {
				fAry[3]++;
			} else if (d >= 140) {
				fAry[2]++;
			} else if (d >= 135) {
				fAry[1]++;
			} else if (d >= 130) {
				fAry[0]++;
			}
		}
		return fAry;
	}
}