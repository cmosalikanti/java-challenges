package org.example.util;

import static java.lang.System.*;

/** FunctionalInterface can have only one abstract method
 *
 */
@FunctionalInterface
interface TestInterface {
    public int sum(int firstNumber, int secondNumber);
}

interface AnyFlower {
    void smells();

    /** The default keyword in interfaces allows developers to provide a default implementation for methods in an interface.
     *  This was introduced in Java 8 to support backward compatibility with older interfaces while adding new functionality.
     *
     */
    default void color() {
        out.println("Transparent");
    }
}
public class DefaultKeywordInInterface implements AnyFlower {
    @Override
    public void smells() {
        out.println("Smells good.");
    }
}

class Jasmine implements AnyFlower {

    @Override
    public void smells() {
        out.println("smells pungent!");
    }

    @Override
    public void color() {
        out.println("White");
    }
}
