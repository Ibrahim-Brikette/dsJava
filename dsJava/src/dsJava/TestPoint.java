package dsJava;
class Point{
	private double x;
	private double y;
	public Point(double x, double y) {
		this.x=x;
		this.y=y;
	}
	//les getteurs
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	//claculer la distance
	public double distanceTo(Point anotherPoint) {
		double xAna=anotherPoint.x;
		double yAna=anotherPoint.y;
		return Math.sqrt((x-xAna)*(x-xAna)+(y-yAna)*(y-yAna));
		
	}
	//translation
	public void translate(double dx,double dy) {
		x+=dx;
		y+=dy;
	}
	//homothotie
	public void homothotie(double scaleFactor) {
		x*=scaleFactor;
		y*=scaleFactor;
	}
	public static Point barycentre(Point[] points) {
		double sommeX = 0;double sommeY=0;
		for(int i=0;i<points.length;i++) {
			sommeX+=points[i].getX();
			sommeY+=points[i].getY();
			
			
		}
		 double xbarycentre= (double)sommeX/points.length;
		 double ybarycentre=(double)sommeY/points.length;
		Point barycentre=new Point(xbarycentre,ybarycentre);
		return barycentre;
	}
}
class Segment{
	Point point1;
	Point point2;
	public Segment(Point point1,Point point2) {
		this.point1=point1;
		this.point2=point2;
	}
	public Point getPoint1() {
		return point1;
		
		
	}
	public Point getPoint2() {
		return point2;
		
		
	}
	public double lenght()
	return point1.distanceTo(point2);
	
}

public class TestPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
