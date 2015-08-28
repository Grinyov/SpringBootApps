package hello;

/**
 * Created by Grinyov Vitaliy on 28.08.15.
 */
public class Greeting {
    private final long id; // номер приветствия
    private final String content; // текст приветствия

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
