package org.example.gateway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class GatewayController {

    @Autowired
    private FeedClient feedClient;

    @GetMapping("/")
    public FeedResponse index() {
        return feedClient.getFeed();
    }

    @FeignClient("feed-service")
    interface FeedClient {
        @RequestMapping(value = "/", method = GET)
        FeedResponse getFeed();
    }

    record FeedResponse(String info, String port) { }
}
