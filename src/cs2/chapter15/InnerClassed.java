package cs2.chapter15;

/**
 * Created by jjenkins on 3/20/2017.
 * An inner class is compiled into a class named OuterClassName$InnerClassName.
 class. For example, the inner class A in Test is compiled into Test$A.class in
 Figure 15.7b.
 ■ An inner class can reference the data and the methods defined in the outer class in
 which it nests, so you need not pass the reference of an object of the outer class to
 the constructor of the inner class. For this reason, inner classes can make programs
 simple and concise. For example, circlePane is defined in ControlCircle in
 Listing 15.3 (line 15). It can be referenced in the inner class EnlargeHandler in
 line 46.
 ■ An inner class can be defined with a visibility modifier subject to the same visibility
 rules applied to a member of the class.
 ■ An inner class can be defined as static. A static inner class can be accessed
 using the outer class name. A static inner class cannot access nonstatic members
 of the outer class.
 ■ Objects of an inner class are often created in the outer class. But you can also create
 an object of an inner class from another class. If the inner class is nonstatic, you must
 first create an instance of the outer class, then use the following syntax to create an
 object for the inner class:
 OuterClass.InnerClass innerObject = outerObject.new InnerClass();
 ■ If the inner class is static, use the following syntax to create an object for it:
 OuterClass.InnerClass innerObject = new OuterClass.InnerClass();
 */
public class InnerClassed {
}
