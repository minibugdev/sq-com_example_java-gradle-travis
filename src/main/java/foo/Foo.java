package foo;

/**
 * Foo class
 */
public class Foo {

    private Foo() {
        // Private constructor to hide the implicit public one
    }

    public static int div(int a, int b) throws MyUnsupportedOperationException {
    	if (b == 0) {
    		throw new MyUnsupportedOperationException("Can't divide by zero!");
    	}
        return a / b;
    }

}
