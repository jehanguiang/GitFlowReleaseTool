
package com.jehang.gitflowHelper.Models.Branches;

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
    "html",
    "avatar"
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
    @JsonProperty("html")
    private Html_ html;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("avatar")
    private Avatar avatar;
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
    @JsonProperty("avatar")
    public Avatar getAvatar() {
        return avatar;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("avatar")
    public void setAvatar(Avatar avatar) {
        this.avatar = avatar;
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
        return new HashCodeBuilder().append(self).append(html).append(avatar).append(additionalProperties).toHashCode();
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
        return new EqualsBuilder().append(self, rhs.self).append(html, rhs.html).append(avatar, rhs.avatar).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
