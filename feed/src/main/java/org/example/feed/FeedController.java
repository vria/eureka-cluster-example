package org.example.feed;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeedController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/")
    public FeedResponse index() {
        return new FeedResponse("A feed for user", port);
    }

    record FeedResponse(String info, String port) { }
}
