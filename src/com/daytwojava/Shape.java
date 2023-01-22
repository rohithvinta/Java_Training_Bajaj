package daytwojava;
public class Shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeMain s = new Square(20);
		ShapeMain rec = new Rectangle(2,3);
		ShapeMain cir=new Circle(20);
		System.out.println(s.calculateArea()+" "+rec.calculateArea()+" "+cir.calculateArea());
		
	}

}