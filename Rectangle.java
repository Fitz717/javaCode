import java.util.function.Predicate;

public class Rectangle {

	private int length,width;
	public Rectangle() {
		
	}
	
	public void  setlength(int length) {
		this.length=length;
	}
	
	public void  setwidth(int width) {
		this.width=width;
	}
	
	public int  area() {
		return length*width;
	}
}
