
public class Uno {

	public static void main(String[] args) {
		int X = 10;
		int Y = 2;
		int Z;
		Z = X + Y;
		System.out.println("Z = X + Y: " +Z);

		Z = X - Y;
		System.out.println("Z = X - Y: " +Z);

		Z = X * Y;
		System.out.println("Z = X * Y: " +Z);

		Z = X / Y;
		System.out.println("Z = X / Y: " +Z);

		Z = X % Y;
		System.out.println("Z = X % Y: " +Z);

		Z = X++;
		System.out.println("Z = X++: " +Z+ ", X: " +X);

		Z = ++X;
		System.out.println("Z = ++X: " +Z+ ", X: " +X);

		Z = X--;
		System.out.println("Z = X--: " +Z+ ", X: " +X);

		Z = --X;
		System.out.println("Z = --X: " +Z+ ", X: " +X);

	}

}
