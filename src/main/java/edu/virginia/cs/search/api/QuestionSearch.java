package edu.virginia.cs.search.api;

import edu.virginia.cs.solr.model.Question;
import edu.virginia.cs.solr.model.QuestionResult;

import java.util.List;

/**
 * Created by cutehuazai on 4/29/17.
 */
public interface QuestionSearch {
    public QuestionResult getQuestionsByTag(String tagName, int pageNum);

    public QuestionResult searchQuestionsBySearchTerm(String searchTerm, int pageNum);

    public String searchQuestions(String searchTerm, int pageNum);

    public long getMatchCount(String searchTerm);

    public long getMatchCountOfTwoTags(String tag1, String tag2);
}

