package homeWork_6.runner;

import homeWork_6.api.ISearchEngine;
import homeWork_6.util.*;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String path = "Course/JD1/HomeWork/src/homeWork_6/book.txt";
        String bookToWork = LineFromFile.makingStringFromFile(path);

        System.out.println("Задание 2.1");
        Set<String> setOfUsedWords = MakeSetOfWord.makingSet(bookToWork);
        System.out.printf("В книге использовано : %d слов\n", setOfUsedWords.size());

        System.out.println("Задание 2.2");
        FindTop_N_Words.printTopWords(MakeMap.makingMap(path), 10);

        System.out.println("Задание 5");
        ISearchEngine easySearch = new EasySearch();
        System.out.printf("слово\t\"%s\"\t употребляется \t %d раз(a)  \n", "война", easySearch.search(bookToWork, "война"));
        System.out.printf("слово\t\"%s\" \t употребляется \t %d раз(a)  \n", "и", easySearch.search(bookToWork, "и"));
        System.out.printf("слово\t\"%s\" \t употребляется \t %d раз(a)  \n", "мир", easySearch.search(bookToWork, "мир"));


    }
}

// поиск слов  прописанных в нижнем регистре