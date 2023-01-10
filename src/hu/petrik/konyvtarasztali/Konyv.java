package hu.petrik.konyvtarasztali;

public class Konyv {
    private int id;
    private String title;
    private String author;
    private int publis_year;
    private int page_count;

    public Konyv(int id, String title, String author, int publis_year, int page_count) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publis_year = publis_year;
        this.page_count = page_count;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublis_year() {
        return publis_year;
    }

    public int getPage_count() {
        return page_count;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublis_year(int publis_year) {
        this.publis_year = publis_year;
    }

    public void setPage_count(int page_count) {
        this.page_count = page_count;
    }
}
