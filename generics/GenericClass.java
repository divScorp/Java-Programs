package generics;

public class GenericClass<T> {

	private T t;
	public void add(T t) {
		this.t=t;
	}
	public T get() {
		return t; 
	}
	public static void main(String[] args) {
		GenericClass<Integer> iObj=new GenericClass<>();
		GenericClass<String> sObj=new GenericClass<>();
		iObj.add(10);
		sObj.add(" Hello ");
		System.out.println("Integer value: "+iObj.get());
		System.out.println("String value: "+sObj.get());
	}
}
