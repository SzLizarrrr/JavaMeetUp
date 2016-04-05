package meetup.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by szlizarrrr on 4/2/16.
 */

@Entity
@Table(name = "issues")
public class Issue {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String title;
    private int comments;

    public Issue() {
    }

    public Issue(long id) {
        this.id = id;
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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Issue{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", comments=" + comments +
                '}';
    }
}
