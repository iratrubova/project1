package application;

public class Poem implements Project{
    private final String name;
    private final String location;
    private final String author;

    public Poem(String name, String location, String author) {
        this.name = name;
        this.location = location;
        this.author = author;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getLocation() {
        return location;
    }

    @Override
    public String getAuthor() {
        return author;
    }
}
