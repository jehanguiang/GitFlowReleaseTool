
package com.jehang.gitflowHelper.Model;

import java.util.HashMap;
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
    "self",
    "comments",
    "patch",
    "html",
    "diff",
    "approve",
    "statuses"
})
public class Links_ {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("self")
    private Self_ self;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("comments")
    private Comments comments;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("patch")
    private Patch patch;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("html")
    private Html_ html;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("diff")
    private Diff diff;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("approve")
    private Approve approve;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("statuses")
    private Statuses statuses;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("self")
    public Self_ getSelf() {
        return self;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("self")
    public void setSelf(Self_ self) {
        this.self = self;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("comments")
    public Comments getComments() {
        return comments;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("comments")
    public void setComments(Comments comments) {
        this.comments = comments;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("patch")
    public Patch getPatch() {
        return patch;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("patch")
    public void setPatch(Patch patch) {
        this.patch = patch;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("html")
    public Html_ getHtml() {
        return html;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("html")
    public void setHtml(Html_ html) {
        this.html = html;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("diff")
    public Diff getDiff() {
        return diff;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("diff")
    public void setDiff(Diff diff) {
        this.diff = diff;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("approve")
    public Approve getApprove() {
        return approve;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("approve")
    public void setApprove(Approve approve) {
        this.approve = approve;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("statuses")
    public Statuses getStatuses() {
        return statuses;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("statuses")
    public void setStatuses(Statuses statuses) {
        this.statuses = statuses;
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
        return new HashCodeBuilder().append(self).append(comments).append(patch).append(html).append(diff).append(approve).append(statuses).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Links_) == false) {
            return false;
        }
        Links_ rhs = ((Links_) other);
        return new EqualsBuilder().append(self, rhs.self).append(comments, rhs.comments).append(patch, rhs.patch).append(html, rhs.html).append(diff, rhs.diff).append(approve, rhs.approve).append(statuses, rhs.statuses).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
