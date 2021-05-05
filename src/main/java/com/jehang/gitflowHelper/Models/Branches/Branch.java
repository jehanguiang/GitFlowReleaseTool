
package com.jehang.gitflowHelper.Models.Branches;

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
    "name",
    "links",
    "default_merge_strategy",
    "merge_strategies",
    "type",
    "target"
})
public class Branch {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    private String name;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("links")
    private Links links;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("default_merge_strategy")
    private String defaultMergeStrategy;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("merge_strategies")
    private List<Object> mergeStrategies = new ArrayList<Object>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("type")
    private String type;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("target")
    private Target target;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("links")
    public Links getLinks() {
        return links;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("links")
    public void setLinks(Links links) {
        this.links = links;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("default_merge_strategy")
    public String getDefaultMergeStrategy() {
        return defaultMergeStrategy;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("default_merge_strategy")
    public void setDefaultMergeStrategy(String defaultMergeStrategy) {
        this.defaultMergeStrategy = defaultMergeStrategy;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("merge_strategies")
    public List<Object> getMergeStrategies() {
        return mergeStrategies;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("merge_strategies")
    public void setMergeStrategies(List<Object> mergeStrategies) {
        this.mergeStrategies = mergeStrategies;
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

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("target")
    public Target getTarget() {
        return target;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("target")
    public void setTarget(Target target) {
        this.target = target;
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
        return new HashCodeBuilder().append(name).append(links).append(defaultMergeStrategy).append(mergeStrategies).append(type).append(target).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Branch) == false) {
            return false;
        }
        Branch rhs = ((Branch) other);
        return new EqualsBuilder().append(name, rhs.name).append(links, rhs.links).append(defaultMergeStrategy, rhs.defaultMergeStrategy).append(mergeStrategies, rhs.mergeStrategies).append(type, rhs.type).append(target, rhs.target).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
