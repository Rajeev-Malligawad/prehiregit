package prehirejava;

public interface Arithmetic {
	int add(int x, int y);
	
	//default can be used
	default void display() {
		System.out.print("default");
	}
	//static can be used
	static void output() {
		System.out.print("default");
	}

}
