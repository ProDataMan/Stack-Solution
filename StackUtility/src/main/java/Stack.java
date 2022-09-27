import java.util.ArrayList;

public class Stack {
	ArrayList<String> stack = new ArrayList<String>();
	
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return stack.isEmpty();
	}

	public void push(String expected) {
		stack.add(expected);
	}

	public String pop() {
		if (stack.isEmpty())
			return null;
					
		return stack.remove(0).toString();
	}

	public String peek() {
		return stack.get(0).toString();
	}

}
