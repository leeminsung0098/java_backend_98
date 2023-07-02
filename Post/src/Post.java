import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
    private Date time;
    private String title;
    private String content;
    private List<String> comments;

    public Post(String title, String content ,Date time) {
        this.title = title;
        this.content = content;
        this.time = time;
        this.comments = new ArrayList<>();
    }

    public Date getTime() {
        return time;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }


    public List<String> getComments() {
        return comments;
    }

    public void addComment(String comment) {
        comments.add(comment);
    }
}
