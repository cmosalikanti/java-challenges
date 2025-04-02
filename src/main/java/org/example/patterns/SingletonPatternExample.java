package org.example.patterns;

/** The Singleton design pattern ensures that a class has only one instance and provides a global point of access to it.
 *  It's typically used for objects that are expensive to create or need to coordinate actions across the system,
 *  like a database connection manager.
 *
 */
public class SingletonPatternExample {
    //  use volatile so all the threads have access to this variable and check if the instance is already there
    private static volatile SingletonPatternExample singletonPatternExample;

    private SingletonPatternExample() {}

    public static SingletonPatternExample getInstance() {
        if (singletonPatternExample == null) {

            //  use a synchronized block here so only one-thread can execute this block of code.
            synchronized (SingletonPatternExample.class) {
                if (singletonPatternExample == null) {
                    singletonPatternExample = new SingletonPatternExample();
                }
            }
        }

        return singletonPatternExample;
    }
}
