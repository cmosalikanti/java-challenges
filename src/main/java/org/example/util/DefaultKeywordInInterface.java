package org.example.util;

import static java.lang.System.*;

/** The default keyword in interfaces allows developers to provide a default implementation for methods in an interface.
 *  This was introduced in Java 8 to support backward compatibility with older interfaces while adding new functionality.
 *
 */

interface AnyFlower {
    void smells();

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
