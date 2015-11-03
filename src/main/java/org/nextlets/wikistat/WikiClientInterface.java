/**
 * Copyright (c) 2015 nextlets.org
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights to use,
 * copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software,
 * and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies
 * or substantial portions of the Software.
 *
 * The Software shall be used for Good, not Evil.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
 * INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE
 * AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package org.nextlets.wikistat;

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
