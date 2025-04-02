package org.example.util;

/** Sealed classes allow you to control which other classes or interfaces can extend or implement them,
 *  which helps maintain more secure and well-defined class hierarchies.
 *
 */
public final class SealedClassExample extends  BaseClass {
    @Override
    void sing() {
        System.out.println("Singing in sub class");
    }
}

sealed class BaseClass {
    void sing() {
        System.out.println("singing");
    }
}
