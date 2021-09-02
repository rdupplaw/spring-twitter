package tech.makers.twitter;

import javax.persistence.*;
import java.util.Date;

// This is a Spring Entity.
// It represents a Model in MVC.
// And each instance, when saved, will refer to a row in the 'tweet' table in the database.
@Entity
public class Tweet {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String body;
    private Date createdAt;

    // @PrePersist means that this method will run before entity is added to database
    @PrePersist
    protected void onCreate() {
        createdAt = new Date();
    }

    protected Tweet() {
    }

    public Tweet(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return String.format("Tweet[id=%d, body='%s']", id, body);
    }

    public Long getId() {
        return id;
    }

    public String getBody() {
        return body;
    }

    public Date getCreatedAt() {
        return createdAt;
    }
}
