package data;

import lombok.Value;

public class DataHelper { // класс, который прячет данные
    private DataHelper() {
    }

    // генерим метод для ввода логина и пароля
    public static AuthInfo getAuthInfo() {
        return new AuthInfo("vasya", "qwerty123");
    }

    // // генерим метод смс-кода
    public static VerificationCode getVerificationCodeFor(AuthInfo authInfo) {
        return new VerificationCode("12345");
    }


    // генерим метод для номеров карты 1 и 2
    public static CardInfo getFirstCardInfo() {
        return new CardInfo("5559000000000001");
    }

    // // генерим метод для номеров карты 1 и 2
    public static CardInfo getSecondCardInfo() {
        return new CardInfo("5559000000000002");
    }

    @Value // библиотека создает геттеры и сеттеры для метода AuthInfo
    public static class AuthInfo {
        String login;
        String password;
    }

    @Value // библиотека создает геттеры и сеттеры для метода VerificationCode
    public static class VerificationCode {
        String code;
    }

    @Value //библиотека создает геттеры и сеттеры для метода CardInfo
    public static class CardInfo {
        String cardNumber;
    }
}