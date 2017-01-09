package foo;

/**
 * Foo class
 */
public class Foo {

    private constructor() {
        // Private constructor to hide the implicit public one
    }

    public static int div(int a, int b) throws Exception {
    	if (b == 0) {
    		throw new MyUnsupportedOperationException();
    	}
        return a / b;
    }

}
