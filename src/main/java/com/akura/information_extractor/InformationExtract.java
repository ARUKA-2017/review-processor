package com.akura.information_extractor;

import com.akura.crawler.models.Review;

import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by sameera on 7/8/17.
 */
public class InformationExtract {
    BufferedReader bufferedReader;
    String line;
    Map<String, Map<Integer, String>> extractedInfoMap = new HashMap<String, Map<Integer, String>>();

    String reviewId;
    int reviewBaseScore;
    String reviewContent;

    String[] tmpReviewContainer;

    public void extractScrapedInfo(String scrapedDataFile){
        try {
            bufferedReader = new BufferedReader(new FileReader(scrapedDataFile));
            while ((line = bufferedReader.readLine()) != null){
                Map<Integer, String> tmpContentMap = new HashMap<Integer, String>();
                tmpReviewContainer = line.split(Review.SEPERATOR);

                reviewId = tmpReviewContainer[0];
                reviewBaseScore = Integer.parseInt(tmpReviewContainer[1]);
                reviewContent = tmpReviewContainer[2];

                tmpContentMap.put(reviewBaseScore, reviewContent);
                extractedInfoMap.put(reviewId, tmpContentMap);
            }
            System.out.println(extractedInfoMap);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
