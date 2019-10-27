package annotation;

public enum Tester {
    Mayank("Mayank Chauhan");

    public String authorName;
    Tester(String authorName)
    {
        this.authorName=authorName;
    }

    public String toString() {
        return this.authorName;
    }
}

