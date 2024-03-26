package Others;

class SuperParent {
	SuperParent(int num) {
		System.out.println("superparent parametrized constructor");
	}
}

class SuperChild extends SuperParent {
	SuperChild() {
		super(10); // call to parameterized constructor of parent class
		System.out.println("superchild class constructor");
	}
}

class SubChild extends SuperChild {
	SubChild(int i) {
		System.out.println("superparent parametrized constructor");
	}

	SubChild() {
		this(10); // call to parameterized constructor of same class
		System.out.println("superparent default constructor");
	}
}

public class ChainDemo {

	public static void main(String[] args) {
		SubChild obj = new SubChild();
	}
}
