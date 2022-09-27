import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class StackTests {
	Stack stack;
	
	@Before
	public void setup() {
		stack = new Stack();
	}
	//Is a new stack empty?
	@Test
	public void testEmptyStack() {
		assertTrue(stack.isEmpty());
		
		}
	
	//If I put one object on the stack, is it still empty?
	@Test
	public void testPushCheckEmpty() {
		String expected = "Hello, World!";
		stack.push(expected);
		assertFalse(stack.isEmpty());	}

	// If I push an object onto the stack and then pop it off, is the stack​
	// empty again?​
	@Test
	public void testPushPopCheckEmpty() {
		String expected = "Hello, World!";
		stack.push(expected);
		String actual = stack.pop();
		assertTrue(stack.isEmpty());
	}
	
	//If I push an object onto the stack, do I get the same one back when I pop​
	// it off?​
	@Test
	public void testPushPopCheckReturn() {
		String expected = "Hello, World!";
		stack.push(expected);
		assertFalse(stack.isEmpty());	}

	// If I push two objects, and take one off, do I get the correct one?​
	@Ignore
	@Test
	public void testPushMultiPopCheckReturn() {
	fail("Not yet implemented");
	}
	
	//If I ask for an object (pop) from an empty stack what do I get?​
	@Test
	public void testPopEmptyStack() {
		assertNull(stack.pop());;
	}
	// If I peek an object, is it still on the stack?
	@Test
	public void testPushPeekCheckEmpty() {
		String expected = "Hello, World!";
		stack.push(expected);
		String actual = stack.peek();
		assertFalse(stack.isEmpty());
	}

	// If I put an two items on a new stack and peek, do I get the correct item.
	@Ignore
	@Test
	public void testPushMultiPeekPopCheckReturn() {
	fail("Not yet implemented");
	}

	// If I peek an empty stack what do I get?
	@Test(expected=Exception.class)
	public void testPeekEmpty() {
		stack.peek();
	}
}
