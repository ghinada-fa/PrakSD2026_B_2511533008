package pekan3_2511533008;

public class stackArray_2511533008 {
	static final int MAX = 1000;
	int top;
	int a[] = new int[MAX];
	boolean isEmpty_2511533008()
	{
		return (top < 0);
	}
	stackArray_2511533008()
	{
		top = -1;
	}
	boolean push_2511533008(int x)
	{
		if (top >= (MAX - 1)) {
			System.out.println("Stack Overflow");
			return false;
		}
		else {
			a[++top] = x;
			System.out.println(x + " dimasukkan dalam stack");
			return true;
		}
	}
	int pop_2511533008()
	{
		if (top < 0) {
			System.out.println("Stack Underflow");
			return 0; 
		}
		else {
			int x = a[top--];
			return x;
		}
	}
	int peek_2511533008()
	{
		if (top < 0) {
			System.out.println("Stack Underflow");
			return 0;
		}
		else {
			int x = a[top];
			return x;
		}
	}
	void print_2511533008 () {
		for (int i = top; i > -1; i--) {
			System.out.print(" " + a[i]);
		}
	}

}
