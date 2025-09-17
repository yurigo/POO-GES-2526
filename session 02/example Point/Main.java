public class Main
{
	public static void main(String[] args) {
		Point p1 = new Point();
		Point p2 = new Point();
		
		// esto da error! por que coords es privado.
		// p1.coords[0] = 100;
		
		p1.move(10, 20);
		p1.show();
		
		p2.show();
		p2.move(1 , 1);
		p2.show();
		
	}
}
