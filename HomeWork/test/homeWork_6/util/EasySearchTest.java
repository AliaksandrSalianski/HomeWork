package homeWork_6.util;

import homeWork_6.api.ISearchEngine;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EasySearchTest {

    @Test
    void search() {
        ISearchEngine easySearch = new EasySearch();
        assertEquals(1, easySearch.search("МирМИР-МИРУ , мир", "мир"));
        assertEquals(0, easySearch.search("Мама мыла раму", "мыл"));
        assertEquals(0, easySearch.search("миротворец", "мир"));
        assertEquals(0, easySearch.search("привет,какдела!", "как"));
        assertEquals(0, easySearch.search("Привет-привет", "привет"));
        assertEquals(1, easySearch.search("Привет -привет", "Привет"));

    }
}