package meetup.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by szlizarrrr on 4/2/16.
 */
public class Issue {

    private String title;
    private int comments;

    public Issue() {
    }

    public Issue(String title, int comments) {
        this.title = title;
        this.comments = comments;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getComments() {
        return comments;
    }

    public void setComments(int comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "Issue{" +
                "title='" + title + '\'' +
                ", comments=" + comments +
                '}';
    }
}
