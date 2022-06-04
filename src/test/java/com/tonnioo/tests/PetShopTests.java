package com.tonnioo.tests;

import com.codeborne.selenide.Condition;
import com.tonnioo.pages.PetShopPage;
import com.tonnioo.tests.wrapper.MenuItem;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;

public class PetShopTests extends TestBase {

    PetShopPage petShopPage = new PetShopPage();

    @Test
    @DisplayName("Page title should have header text")
    void titleTest() {
        step("Open url https://www.petshop.ru/", () ->
                petShopPage.openPage());

        step("Page title should have text 'Товары для животных, зоотовары онлайн, " +
                "корма для домашних животных купить в интернет-магазине Petshop.ru'", () -> {

            String expectedTitle = "Товары для животных, зоотовары онлайн, " +
                    "корма для домашних животных купить в интернет-магазине Petshop.ru";

            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @DisplayName("Search field tests petshop.ru")
    @ValueSource(strings = {
            "кошка",
            "собака"
    })
    @ParameterizedTest(name = "Search tests{0}")
    void SearchTest(String testData) {
        step("Open url https://www.petshop.ru/", () ->
                petShopPage.openPage());

        step("Enter the words in the search field", () ->
                $(".MuiInputBase-input").setValue(testData).pressEnter());

        step("Verify that the search returned the word", () ->
                $("[name=q]").shouldHave(value(testData)));
    }

    @DisplayName("Horizontal Menu Tests")
    @EnumSource(MenuItem.class)
    @ParameterizedTest(name = "HorizontalMenuTests")
    void HorMenuTest(MenuItem testData) {
        step("Open url https://www.petshop.ru/", () ->
                petShopPage.openPage());
        step(" Show Horizontal Menu", () ->
                $$(".NavBar_menu_item__3Ap9n").find(Condition.text(testData.rusName)).hover());

    }

    @Test
    @DisplayName("City change test")
    void cityChangeTest() {
        step("Open url https://www.petshop.ru/", () ->
                petShopPage.openPage());

        step("open city selection window", () ->
                $("[data-testid=City]").click());

        step("check window opening", () ->
                $("[data-testid=DialogWindow__wrap]").shouldBe(visible));

        step("choose the city of Moscow", () ->
                $("[data-testid=top-city-list]").$("[data-testid=SingleCity__city]")
                        .find(byText("Москва"))).click();
        step("verify that the city of Moscow is selected", () ->
                $("[data-testid=City]").shouldHave(text("Москва")));


    }


}





