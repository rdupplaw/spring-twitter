package tech.makers.twitter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TweetService {

    @Autowired
    private TweetRepository tweetRepository;

    public List<Tweet> findAll(Sort sort) {
        return tweetRepository.findAll(sort);
    }

    public Tweet save(Tweet tweet) {
        return tweetRepository.save(tweet);
    }
}
