package testGitHub;

class Point {
	int x;
	int y;
	Point(int value1, int value2) {
		x = value1;
		y = value2;
	}
}

class Line {
	Point a;
	Point b;
	
	Line(Point valpoint1, Point valpoint2) {
		a = valpoint1;
		b = valpoint2;
	}
}

class Triangle {
	Point a;
	Point b;
	Point c;
	
	Triangle(Point valpoint1, Point valpoint2, Point valpoint3) {
		a = valpoint1;
		b = valpoint2;
		c = valpoint3;
	}
}
	
 class Square {
	 Point a;
	 Point b;
	 Point c;
	 Point d;
	 	 	 
	 Square (Point vala, Point valb, Point valc, Point vald) {
		 if (vala.y == valb.y && valb.x == valc.x && valc.y == vald.y && vald.x == vala.x) {
			 a = vala;
			 b = valb;		 
			 c = valc;
			 d = vald;		 
		 } else {
			 System.out.println("This not square.");
			 a = b = c = d = null;			 
		 }
	 }
 }
 


public class TestGitHub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Big World!");
		//for line
		Point a = new Point(1, 2);
		Point b = new Point(3, 4);		
		Line ab = new Line(a, b);
		System.out.println("Line AB:");
		System.out.println("A(" + ab.a.x + "," + ab.a.y + ")");
		System.out.println("B(" + ab.b.x + ", " + ab.b.y + ")");
		//for triangle
		Point c = new Point(5, 6);
		Triangle abc = new Triangle(a, b, c);
		System.out.println("Triangle ABC:");
		System.out.println("A(" + abc.a.x + "," + abc.a.y + ")");
		System.out.println("B(" + abc.b.x + "," + abc.b.y + ")");
		System.out.println("C(" + abc.c.x + "," + abc.c.y + ")");
		//for square
		Point d = new Point(7, 8);
		Square abcd = new Square(a, b, c, d);		
		System.out.println("Square ABCD:");
		System.out.println("A(" + abcd.a.x + "," + abcd.a.y + ")");
		System.out.println("B(" + abcd.b.x + "," + abcd.b.y + ")");
		System.out.println("C(" + abcd.c.x + "," + abcd.c.y + ")");
		System.out.println("D(" + abcd.d.x + "," + abcd.d.y + ")");
	}

}
