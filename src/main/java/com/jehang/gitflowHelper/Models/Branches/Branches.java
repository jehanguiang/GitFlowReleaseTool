
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
    "pagelen",
    "values",
    "page",
    "size"
})
public class Branches {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("pagelen")
    private Integer pagelen;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("values")
    private List<Branch> values = new ArrayList<>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("page")
    private Integer page;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("size")
    private Integer size;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("pagelen")
    public Integer getPagelen() {
        return pagelen;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("pagelen")
    public void setPagelen(Integer pagelen) {
        this.pagelen = pagelen;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("values")
    public List<Branch> getValues() {
        return values;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("values")
    public void setValues(List<Branch> values) {
        this.values = values;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("page")
    public Integer getPage() {
        return page;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("page")
    public void setPage(Integer page) {
        this.page = page;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("size")
    public Integer getSize() {
        return size;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("size")
    public void setSize(Integer size) {
        this.size = size;
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
        return new HashCodeBuilder().append(pagelen).append(values).append(page).append(size).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Branches) == false) {
            return false;
        }
        Branches rhs = ((Branches) other);
        return new EqualsBuilder().append(pagelen, rhs.pagelen).append(values, rhs.values).append(page, rhs.page).append(size, rhs.size).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
