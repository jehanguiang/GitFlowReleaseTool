
package com.jehang.gitflowHelper.Models.Commits;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "rendered",
    "hash",
    "repository",
    "links",
    "author",
    "summary",
    "parents",
    "date",
    "message",
    "type"
})
public class RepositoryValues {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("rendered")
    private Rendered rendered;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("hash")
    private String hash;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("repository")
    private Repository repository;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("links")
    private Links_ links;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("author")
    private Author author;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("summary")
    private Summary summary;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("parents")
    private List<Object> parents = new ArrayList<Object>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("date")
    private String date;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("message")
    private String message;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("type")
    private String type;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("rendered")
    public Rendered getRendered() {
        return rendered;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("rendered")
    public void setRendered(Rendered rendered) {
        this.rendered = rendered;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("hash")
    public String getHash() {
        return hash;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("hash")
    public void setHash(String hash) {
        this.hash = hash;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("repository")
    public Repository getRepository() {
        return repository;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("repository")
    public void setRepository(Repository repository) {
        this.repository = repository;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("links")
    public Links_ getLinks() {
        return links;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("links")
    public void setLinks(Links_ links) {
        this.links = links;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("author")
    public Author getAuthor() {
        return author;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("author")
    public void setAuthor(Author author) {
        this.author = author;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("summary")
    public Summary getSummary() {
        return summary;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("summary")
    public void setSummary(Summary summary) {
        this.summary = summary;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("parents")
    public List<Object> getParents() {
        return parents;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("parents")
    public void setParents(List<Object> parents) {
        this.parents = parents;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(rendered).append(hash).append(repository).append(links).append(author).append(summary).append(parents).append(date).append(message).append(type).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RepositoryValues) == false) {
            return false;
        }
        RepositoryValues rhs = ((RepositoryValues) other);
        return new EqualsBuilder().append(rendered, rhs.rendered).append(hash, rhs.hash).append(repository, rhs.repository).append(links, rhs.links).append(author, rhs.author).append(summary, rhs.summary).append(parents, rhs.parents).append(date, rhs.date).append(message, rhs.message).append(type, rhs.type).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
