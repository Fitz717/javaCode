
public class Collection {


 
	public static void main(String[] args) {
		
		SetArrayList<String> s1=new SetArrayList<String>(20);
		s1.add("1");
		s1.add("2");
		s1.add("3");
		System.out.println(s1);
		
	}
}

class SetArrayList<E>{
	
	private Object[] elementData;
	private int size;
	
	private static final int DEFAULT_CAPACITY=10;
	
	public SetArrayList() {
		elementData=new Object[DEFAULT_CAPACITY];
	}
	
	public SetArrayList(int capatity) {
		elementData =new Object[capatity];
	}
	
	public void add(E element) {
		elementData[size++]=element;
		
	}
	public String toString(){
		StringBuilder sb =new StringBuilder();
		
		sb.append("[");
		
		for(int i=0;i<size;i++) {
			sb.append(elementData[i]+",");
		}
		sb.setCharAt(sb.length()-1, ']');
		return sb.toString();
		
	}
 }