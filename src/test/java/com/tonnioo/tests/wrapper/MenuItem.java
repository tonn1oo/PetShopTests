package com.tonnioo.tests.wrapper;

public enum MenuItem {
    CAT("Кошки"),
    DOG("Собаки"),
    PUP("Котята и щенки"),
    PET("Другие питомцы");

    public final String rusName;

    MenuItem(String rusName) {
        this.rusName = rusName;
    }
}
