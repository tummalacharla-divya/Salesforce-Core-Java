class Area{
	public static final double PI=3.14;
	public double area(double radius){
		return PI*radius*radius;
	}
	public int area(int side){
		return side*side;
	}
	public double area(int l,double b){
		return l*b;
	}
	public double area(double h,int b){
		return (h*b)/2;
	}
}
class AreaCalculation{
	public static void main(String[] args){
		Area a=new Area();
		System.out.println("Area of circle: "+a.area(2,7));
	}
}
