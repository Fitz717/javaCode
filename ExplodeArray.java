
public class ExplodeArray {

	public static void main(String[] args) {
		
		AddArray<String> s1=new AddArray<String>(20);

		for(int i=0;i<500;i++) {
			Integer i1=new Integer(i);
			String s=i1.toString();
			s1.add(s);}
		System.out.println(s1);
	}

}

class AddArray<E>{
	
	private Object[] elementData;
	private int size;
	
	private static final int DEFAULT_CAPACITY=10;
	
	public AddArray() {
		elementData=new Object[DEFAULT_CAPACITY];
	}
	public AddArray(int capatity) {
		elementData =new Object[capatity];	
	}
	public void add(E element) {
		elementData[size++]=element;
		if(size==elementData.length) {
			Object[] newArray=new Object[elementData.length+elementData.length/2];
			System.arraycopy( elementData, 0,newArray, 0 ,elementData.length);
			elementData=newArray;
		}
	
	}
		public String toString(){
		
		StringBuilder sb =new StringBuilder();
		sb.append("[");
		
		for(int i=0;i<size;i++) 
			sb.append(elementData[i]+",");
		
		sb.setCharAt(sb.length()-1, ']');
		return sb.toString();
		
	}

	}
	
	
