# WIKI stat

This small and very easy project is dedicated for receiving statistics about Wikipedia page views.

## Interface
```java
public interface WikiClientInterface {

    /**
     * Returns article statistics.
     * @param lang - article language
     * @param period - statistics period
     * @param article - article name
     * @return article statistics
     */
    ArticleStatistics getArticleStatistics(Lang lang, Period period, String article);
    
    /**
     * Returns article statistics.
     * @param lang - article language
     * @param year - year
     * @param month - month (1-12)
     * @param article - article name
     * @return article statistics.
     */
    ArticleStatistics getArticleStatistics(Lang lang, int year, int month, String article);
}
```

## How to use
```java

// create WikiClient
WikiClient client = WikiClient.getInstance();

// Get statistics for last 30 days
ArticleStatistics stats = client.getArticleStatistics(Lang.Lang.English, Period.Period.latest30, "Led_Zeppelin");

// Get statistics for this month
Calendar cal = Calendar.getInstance();
stats = client.getArticleStatistics(Lang.Lang.English, cal.get(Calendar.YEAR), cal.get(Calendar.MONTH) + 1, "Pink_Floyd");

// Get statistics for previous month
cal.add(Calendar.MONTH, -1);
stats = client.getArticleStatistics(Lang.Lang.English, cal.get(Calendar.YEAR), cal.get(Calendar.MONTH) + 1,  "Deep_Purple");

```
## Objects structure
```java
public class ArticleStatistics {

	private String project;
	private String month;
	private Integer rank;
	private String title;

	private Map<String, Integer> dailyViews;
	
	>>> getters & setters here <<<
}
```

```dailyViews``` map contais pairs ```date - count```, date in format ```yyyy-MM-dd```. 

## Dependecies

Maven:
```xml
<dependency>
	<groupId>org.nextlets</groupId>
	<artifactId>easy-rest-client</artifactId>
	<version>1.0.2</version>
</dependency>
```
You can download and build ERC from here: https://github.com/nextlets/erc

## Source
Data is received from http://stats.grok.se


