package calculator;

public class Calculator {
	public static void main(String[] args) {
		Constant cst = new Constant();
		double[] dAry = cst.doubleAry();
		System.out.println("合計："+doubleSum(dAry));
		System.out.println("平均："+doubleAve(dAry));
		System.out.println("標準偏差："+doubleHensa(dAry));
		System.out.println("最大値："+doubleMax(dAry));
		System.out.println("最小値："+doubleMin(dAry));
	}
	//合計
	public static double doubleSum(double[] dAry) {
		double dTotal=0;
		for(double d:dAry) {
			dTotal+=d;
		}
		return dTotal;
	}

	//平均
	public static double doubleAve(double[] dAry) {
		double dTotal = doubleSum(dAry);
		return dTotal/dAry.length;
	}

	//標準偏差
	public static double doubleHensa(double[] dAry) {
		double dSaTotal=0;
		double dAve=doubleAve(dAry);
		for(double d:dAry) {
			dSaTotal+=Math.pow(d-dAve,2);
		};
		double bunsan= dSaTotal/dAry.length;
		return Math.sqrt(bunsan);
	}

	//最大値
	public static double doubleMax(double[] dAry) {
		double dMax=Integer.MIN_VALUE;
		for(double d:dAry) {
			if(dMax<d)dMax=d;
		}
		return dMax;
	}

	//最小値
	public static double doubleMin(double[] dAry) {
		double dMin=Integer.MAX_VALUE;
		for(double d:dAry) {
			if(dMin>d)dMin=d;
		}
		return dMin;
	}
}
class Constant {
	private double[] constantDoubleAry = {
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
	public double[] doubleAry() {
		return this.constantDoubleAry;
	}
}