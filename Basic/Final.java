// Example of final variable
class FinalVariableExample {
    final int x = 10;

    void modifyVariable() {
        // This will result in a compilation error
        // because you cannot modify a final variable.
        // x = 20;
    }
}

// Example of final method
class FinalMethodExample {
    final void someMethod() {
        System.out.println("This is a final method.");
    }
}

class SubClass extends FinalMethodExample {
    // This will result in a compilation error
    // because you cannot override a final method.
    // void someMethod() {
    //     System.out.println("Trying to override a final method.");
    // }
}

// Example of final class
final class FinalClassExample {
    // This class cannot be subclassed.
}

// This will result in a compilation error
// because you cannot extend a final class.
// class SubClass extends FinalClassExample {
// }

// Example of final parameter
class FinalParameterExample {
    void printValue(final int value) {
        // This will result in a compilation error
        // because you cannot modify a final parameter.
        // value = 5;

        System.out.println("Final parameter value: " + value);
    }
}

public class Final {
    public static void main(String[] args) {
        // Example of final variable
        FinalVariableExample finalVarExample = new FinalVariableExample();
        System.out.println("Final variable value: " + finalVarExample.x);

        // Example of final method
        FinalMethodExample finalMethodExample = new FinalMethodExample();
        finalMethodExample.someMethod();

        // Example of final class
        FinalClassExample finalClassExample = new FinalClassExample();

        // Example of final parameter
        FinalParameterExample finalParamExample = new FinalParameterExample();
        finalParamExample.printValue(42);
    }
}
