package Advanced;

public class NestedClasses {
        
    // Static nested class
    static class StaticNestedClass {
        void staticNestedMethod() {
            System.out.println("Static nested method");
        }
    }

    // Inner class
    class InnerClass {
        void innerMethod() {
            System.out.println("Inner method");
        }
    }

    public static void main(String[] args) {
        // Accessing static nested class
        StaticNestedClass staticNestedObject = new StaticNestedClass();
        staticNestedObject.staticNestedMethod();
        
        // Accessing inner class
        Main outerObject = new Main();
        InnerClass innerObject = outerObject.new InnerClass();
        innerObject.innerMethod();
        
        // Local class inside a method
        class LocalClass {
            void localMethod() {
                System.out.println("Local method");
            }
        }
        
        // Accessing local class
        LocalClass localObject = new LocalClass();
        localObject.localMethod();
    }
}