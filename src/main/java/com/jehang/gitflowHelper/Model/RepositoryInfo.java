
package com.jehang.gitflowHelper.Model;

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
    "values"
})
public class RepositoryInfo {

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
    private List<RepositoryValues> values = new ArrayList<>();
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
     * @return
     */
    @JsonProperty("values")
    public List<RepositoryValues> getValues() {
        return values;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("values")
    public void setValues(List<RepositoryValues> values) {
        this.values = values;
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
        return new HashCodeBuilder().append(pagelen).append(values).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RepositoryInfo) == false) {
            return false;
        }
        RepositoryInfo rhs = ((RepositoryInfo) other);
        return new EqualsBuilder().append(pagelen, rhs.pagelen).append(values, rhs.values).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
