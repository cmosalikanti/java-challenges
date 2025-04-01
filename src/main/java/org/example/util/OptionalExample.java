package org.example.util;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Optional<String> str = Optional.empty();
        System.out.println(str.isPresent());

        str = Optional.ofNullable("fan");
        System.out.println(str.isPresent());
    }
}
