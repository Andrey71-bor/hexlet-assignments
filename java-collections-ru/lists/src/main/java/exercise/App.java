package exercise;

import java.util.ArrayList;
import java.util.List;

// BEGIN
class App {
    public static boolean scrabble(String letters, String word) {
        // Преобразуем набор символов в нижний регистр
        letters = letters.toLowerCase();
        // Преобразуем слово в нижний регистр
        word = word.toLowerCase();

        List<Character> letterList = new ArrayList<>();
        // Добавляем каждый символ из набора в ArrayList
        for (char c : letters.toCharArray()) {
            letterList.add(c);
        }

        // Проверяем каждый символ слова
        for (char c : word.toCharArray()) {
            // Если символ присутствует в списке, удаляем его
            if (letterList.contains(c)) {
                letterList.remove(Character.valueOf(c));
            } else {
                return false;
            }
        }

        // Если все символы слова удалось проверить и удалить из списка, значит слово составимо
        return true;
    }

    public static void main(String[] args) {
        System.out.println(scrabble("rkqodlw", "world")); // true
        System.out.println(scrabble("ajv", "java")); // false
        System.out.println(scrabble("avjafff", "JaVa")); // true
        System.out.println(scrabble("", "hexlet")); // false
    }
}
//END
