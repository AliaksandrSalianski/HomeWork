package homeWork_6.runner;

import homeWork_6.util.FindTop_N_Words;
import homeWork_6.util.LineFromFile;
import homeWork_6.util.MakeSetOfWord;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String path = "book.txt";
        String bookToWork = LineFromFile.makingStringFromFile(path);

        System.out.println("Задание 2.1");
        Set<String> setOfUsedWords = MakeSetOfWord.makingSet(bookToWork);
        System.out.printf("В книге использовано : %d слов", setOfUsedWords.size());

        System.out.println("Задание 2.2");
        FindTop_N_Words.printTopWords();
    }
}

