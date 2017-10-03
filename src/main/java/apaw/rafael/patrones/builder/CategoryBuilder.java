package apaw.rafael.patrones.builder;

import apaw.rafael.patrones.Category;

public class CategoryBuilder {
    private Category category;

    private long id;

    private int rank;

    private String title;

    public CategoryBuilder(long id, String title) {
        this.id = id;
        this.title = title;
    }

    public CategoryBuilder() {
        this(0, "");
    }

    public CategoryBuilder id(long id) {
        this.id = id;
        this.category = new Category(id, rank, title);
        return this;
    }

    public CategoryBuilder rank(int rank) {
        this.rank = rank;
        this.category = new Category(id, rank, title);
        return this;
    }

    public CategoryBuilder title(String title) {
        this.title = title;
        this.category = new Category(id, rank, title);
        return this;
    }

    public Category build() {
        return this.category;
    }
}
