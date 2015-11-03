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

import java.util.Map;

import com.google.gson.annotations.SerializedName;

public class ArticleStatistics {

	private String project;
	private String month;
	private Integer rank;
	private String title;

	@SerializedName("daily_views")
	private Map<String, Integer> dailyViews;
	

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}

	public Integer getRank() {
		return rank;
	}

	public void setRank(Integer rank) {
		this.rank = rank;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

    public Map<String, Integer> getDailyViews() {
        return dailyViews;
    }

    public void setDailyViews(Map<String, Integer> daily_views) {
        this.dailyViews = daily_views;
    }

    @Override
    public String toString() {
        return "ArticleStatistics [title=" + title + ", project=" + project + ", month=" + month + ", rank=" + rank
                + ", dailyViews=" + dailyViews + "]";
    }

}
