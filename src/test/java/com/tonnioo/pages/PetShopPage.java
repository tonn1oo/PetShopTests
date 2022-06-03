package com.tonnioo.pages;

import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;


public class PetShopPage {
    public PetShopPage openPage() {
        step("Open petshop.ru", () -> {
            open("https://www.petshop.ru/");
        });
        return this;
    }

}
