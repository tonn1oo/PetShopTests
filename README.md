# Автоматизации тестирования интернет магазина:
# <a target="_blank" href="https://www.petshop.ru/">petshop.ru</a>

<img title="petshopmainpage" src="images/screenshot/Screenshot from 2022-06-05 02-31-40.png">
</p>

## Code stack
<p align="left">
<img width="6%" title="Java" src="images/logo/Java.svg">
<img width="6%" title="Gradle" src="images/logo/Gradle.svg">
<img width="6%" title="Allure Report" src="images/logo/Allure_Report.svg">
<img width="6%" title="JUnit5" src="images/logo/JUnit5.svg">
<img width="6%" title="Selenide" src="images/logo/Selenide.svg">
</p>

## Infrastructure
<p align="left">
<img width="6%" title="IntelliJ IDEA" src="images/logo/Intelij_IDEA.svg">
<img width="6%" title="Selenoid" src="images/logo/Selenoid.svg">
<img width="6%" title="GitHub" src="images/logo/GitHub.svg">
<img width="6%" title="Jenkins" src="images/logo/Jenkins.svg">
<img width="6%" title="Telegram" src="images/logo/Telegram.svg">
</p>

## Implemented checks
- Проверка 
- Проверка
- Проверка 
- Проверка 
- Проверка 

## Builds in Jenkins
### <a target="_blank" href="https://jenkins.autotests.cloud/job/tonnioo_petshop_tests/">Параметризированная сборка в Jenkins</a>
<p align="center">
<img title="Jenkins Job Run with parameters" src="images/screenshot/Jenkins_1.png">
</p>
<p align="center">
<img title="Jenkins Dashboard" src="images/screenshot/Jenkins_2.png">
</p>

## Запуск из терминала
Локальный запуск всех тестов:
```
gradle clean test
```
Удаленный запуск всех тестов:
```
clean
test
 -Dbrowser=${BROWSER}
 -DbrowserVersion=${BROWSER_VERSION}
 -DbrowserSize=${BROWSER_SIZE}
 -DbaseUrl=${BASE_URL}
 -Dremote=${REMOTE}
```
