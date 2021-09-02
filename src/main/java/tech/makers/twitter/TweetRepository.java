package tech.makers.twitter;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

// This is a Repository Interface
// Instances of it are used to load and store Tweets into the database.
// By using an interface here, we're telling Spring what we want, and Spring
// will then go and create it for us.
public interface TweetRepository extends JpaRepository<Tweet, Long> {
    //  This is how we specify the Entity it refers to. ^^^^^
    List<Tweet> findById(long id);
}
