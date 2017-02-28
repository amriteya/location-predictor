package com.panda.location.predictor.pojo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "location",
    "popularity",
    "link",
    "nearby_restaurants"
})
public class ZomatoResponse {

    @JsonProperty("location")
    private Location location;
    @JsonProperty("popularity")
    private Popularity popularity;
    @JsonProperty("link")
    private String link;
    @JsonProperty("nearby_restaurants")
    private List<NearbyRestaurant> nearbyRestaurants = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("location")
    public Location getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(Location location) {
        this.location = location;
    }

    @JsonProperty("popularity")
    public Popularity getPopularity() {
        return popularity;
    }

    @JsonProperty("popularity")
    public void setPopularity(Popularity popularity) {
        this.popularity = popularity;
    }

    @JsonProperty("link")
    public String getLink() {
        return link;
    }

    @JsonProperty("link")
    public void setLink(String link) {
        this.link = link;
    }

    @JsonProperty("nearby_restaurants")
    public List<NearbyRestaurant> getNearbyRestaurants() {
        return nearbyRestaurants;
    }

    @JsonProperty("nearby_restaurants")
    public void setNearbyRestaurants(List<NearbyRestaurant> nearbyRestaurants) {
        this.nearbyRestaurants = nearbyRestaurants;
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

}
