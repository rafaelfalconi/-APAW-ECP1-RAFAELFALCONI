package apaw.rafael.patrones.builder;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import apaw.rafael.patrones.Category;

public class CategoryBuilderTest {
    @Test
    public void testCategoryBuilderLongStringInt() {
        Category category = new CategoryBuilder().id(1457888).rank(5).title("Sistemas").build();
        assertEquals(1457888, category.getId());
        assertEquals("Sistemas", category.getTitle());
        assertEquals(5, category.getRank());
    }

}
