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

class Rectangle{
	 Point a;
	 Point b;
	 Point c;
	 Point d;
	 	 	 
	 Rectangle (Point vala, Point valb, Point valc, Point vald) {
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
		System.out.println("Hello World!");
		Point a = new Point(1, 2);
		Point b = new Point(3, 4);		
		Line ab = new Line(a, b);
		System.out.println("Line AB:\nA(" + ab.a.x + ", " + ab.a.y + ")\nB(" + ab.b.x + ", " + ab.b.y + ")");
				
	}

}
