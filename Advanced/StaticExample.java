public class StaticExample {

    public static void main(String[] args) {
        // Accessing static nested class without creating an instance of the outer class
        OuterClass.StaticNestedClass staticNestedObject = new OuterClass.StaticNestedClass();
        staticNestedObject.printMessage();
    }

    static class OuterClass {
        static class StaticNestedClass {
            public void printMessage() {
                System.out.println("This is a static nested class.");
            }
        }
    }
}
