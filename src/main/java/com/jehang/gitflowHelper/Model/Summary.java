
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
    "raw",
    "markup",
    "html",
    "type"
})
public class Summary {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("raw")
    private String raw;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("markup")
    private String markup;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("html")
    private String html;
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
    @JsonProperty("raw")
    public String getRaw() {
        return raw;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("raw")
    public void setRaw(String raw) {
        this.raw = raw;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("markup")
    public String getMarkup() {
        return markup;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("markup")
    public void setMarkup(String markup) {
        this.markup = markup;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("html")
    public String getHtml() {
        return html;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("html")
    public void setHtml(String html) {
        this.html = html;
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
        return new HashCodeBuilder().append(raw).append(markup).append(html).append(type).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Summary) == false) {
            return false;
        }
        Summary rhs = ((Summary) other);
        return new EqualsBuilder().append(raw, rhs.raw).append(markup, rhs.markup).append(html, rhs.html).append(type, rhs.type).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
