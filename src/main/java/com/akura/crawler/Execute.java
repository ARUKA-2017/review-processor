package com.akura.crawler;

import java.io.IOException;

/**
 * Created by sameera on 7/8/17.
 */
public class Execute {
    public static void main(String[] args) throws IOException {
        ReviewCrawler crawler = new ReviewCrawler();
        crawler.fetchReview("B00YD547Q6");
    }
    public void executeScrape(String itemId){
        ReviewCrawler crawler = new ReviewCrawler();
        crawler.fetchReview(itemId);
    }
}
