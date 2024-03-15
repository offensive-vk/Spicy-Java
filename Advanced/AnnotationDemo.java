package Advanced;

import java.lang.annotation.*;

// Marker Annotation
@Retention(RetentionPolicy.RUNTIME)
@interface MarkerAnnotation {}

// Single Member Annotation
@Retention(RetentionPolicy.RUNTIME)
@interface SingleMemberAnnotation {
    String value();
}

// Predefined Annotations
public class AnnotationDemo {

    // @Override: Indicates that a method overrides a superclass method
    @Override
    public String toString() {
        return "AnnotationDemo{}";
    }

    // @Deprecated: Marks a program element as deprecated
    @Deprecated
    public void deprecatedMethod() {
        System.out.println("This method is deprecated.");
    }

    // @SuppressWarnings: Suppresses compiler warnings
    @SuppressWarnings("unchecked")
    public void suppressedMethod() {
        java.util.List list = new java.util.ArrayList();
        list.add("Suppressing warnings.");
    }

    // @SafeVarargs: Suppresses unchecked warnings for varargs methods
    @SafeVarargs
    public final <T> void safeVarargsMethod(T... elements) {
        System.out.println("Using @SafeVarargs annotation.");
    }

    // @FunctionalInterface: Indicates that an interface is a functional interface
    @FunctionalInterface
    interface MyFunctionalInterface {
        void myMethod();
    }

    public static void main(String[] args) {
        AnnotationDemo demo = new AnnotationDemo();

        // Using the annotations
        demo.deprecatedMethod();
        demo.suppressedMethod();
        demo.safeVarargsMethod("element1", "element2");

        // Using @Override annotation
        System.out.println(demo);

        // Using lambda expression with @FunctionalInterface
        MyFunctionalInterface functionalInterface = () -> System.out.println("Functional Interface Method");
        functionalInterface.myMethod();
    }
}

/**

In Java, an annotation is a form of metadata that provides data about a program but is not part of the program itself. Annotations can be attached to various program elements such as classes, methods, fields, parameters, and other types of declarations to provide additional information about them.

Annotations are introduced in Java since version 5 (Java SE 5.0) as a feature of the Java language. They are defined using the @interface keyword followed by the annotation name, and they can include elements that can have default values. Annotations can be used by the compiler, runtime environment, or other tools for processing or validation purposes.

Annotations in Java can serve multiple purposes, including:

Information for the Compiler: Annotations provide additional information to the compiler, which can be used to generate warnings, errors, or perform other compile-time checks.

Information for Runtime Processing: Annotations can be retained at runtime and accessed via reflection, allowing runtime processing of program elements based on their annotations.

Configuration and Metadata: Annotations can be used to provide configuration parameters or metadata about program elements, which can be used by frameworks, libraries, or other tools for various purposes such as dependency injection, persistence mapping, or documentation generation.

Code Generation: Annotations can be used by code generation tools or frameworks to generate code, configuration files, or other resources based on the annotations present in the source code.

Some commonly used annotations in Java include @Override, @Deprecated, @SuppressWarnings, @FunctionalInterface, @Retention, @Target, and custom annotations defined by developers.
 */