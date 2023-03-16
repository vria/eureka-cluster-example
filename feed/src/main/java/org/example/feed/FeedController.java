package org.example.feed;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeedController {
    @GetMapping("/")
    public FeedResponse index() {
        return new FeedResponse("A feed for user");
    }

    record FeedResponse(String info) { }
}
