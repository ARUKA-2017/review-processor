package com.akura;

import com.akura.crawler.Execute;
import com.akura.information_extractor.InformationExtract;

import java.io.File;

/**
 * Hello world!
 *
 */
public class App 
{
    private static final String PRODUCT_ID = "B06Y137TLR";
    static Execute execute = new Execute();
    static InformationExtract informationExtract = new InformationExtract();

    public static void main(String[] args )
    {
        //execute.executeScrape(PRODUCT_ID);
        informationExtract.extractScrapedInfo("YahooMailReviews.txt");
    }
}
