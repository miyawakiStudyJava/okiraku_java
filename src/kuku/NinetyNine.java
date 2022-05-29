package kuku;

public class NinetyNine {
	public static void main(String[] args) {
		Table table =new Table();
		table.header();
		table.allLine();
	}
}
class Table{
	void header() {
		System.out.print("   |");
		for(int i=0;i<9;i++) {
			System.out.print(String.format("%3s",i+1));
		}
		System.out.println();
		System.out.print("---+");
		for(int i=0;i<9;i++) {
			System.out.print("---");
		}
		System.out.println();
	}
	void allLine() {
		for(int i=0;i<9;i++) {
			System.out.printf(" %d |",i);
			for(int j=0;j<9;j++) {
				System.out.print(String.format("%3s",(i+1)*(j+1)));
			}
			System.out.println();
		}
	}
}