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
    "popularity",
    "nightlife_index",
    "nearby_res",
    "top_cuisines",
    "popularity_res",
    "nightlife_res",
    "subzone",
    "subzone_id",
    "city"
})
public class Popularity {

    @JsonProperty("popularity")
    private String popularity;
    @JsonProperty("nightlife_index")
    private String nightlifeIndex;
    @JsonProperty("nearby_res")
    private List<String> nearbyRes = null;
    @JsonProperty("top_cuisines")
    private List<String> topCuisines = null;
    @JsonProperty("popularity_res")
    private String popularityRes;
    @JsonProperty("nightlife_res")
    private String nightlifeRes;
    @JsonProperty("subzone")
    private String subzone;
    @JsonProperty("subzone_id")
    private Integer subzoneId;
    @JsonProperty("city")
    private String city;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("popularity")
    public String getPopularity() {
        return popularity;
    }

    @JsonProperty("popularity")
    public void setPopularity(String popularity) {
        this.popularity = popularity;
    }

    @JsonProperty("nightlife_index")
    public String getNightlifeIndex() {
        return nightlifeIndex;
    }

    @JsonProperty("nightlife_index")
    public void setNightlifeIndex(String nightlifeIndex) {
        this.nightlifeIndex = nightlifeIndex;
    }

    @JsonProperty("nearby_res")
    public List<String> getNearbyRes() {
        return nearbyRes;
    }

    @JsonProperty("nearby_res")
    public void setNearbyRes(List<String> nearbyRes) {
        this.nearbyRes = nearbyRes;
    }

    @JsonProperty("top_cuisines")
    public List<String> getTopCuisines() {
        return topCuisines;
    }

    @JsonProperty("top_cuisines")
    public void setTopCuisines(List<String> topCuisines) {
        this.topCuisines = topCuisines;
    }

    @JsonProperty("popularity_res")
    public String getPopularityRes() {
        return popularityRes;
    }

    @JsonProperty("popularity_res")
    public void setPopularityRes(String popularityRes) {
        this.popularityRes = popularityRes;
    }

    @JsonProperty("nightlife_res")
    public String getNightlifeRes() {
        return nightlifeRes;
    }

    @JsonProperty("nightlife_res")
    public void setNightlifeRes(String nightlifeRes) {
        this.nightlifeRes = nightlifeRes;
    }

    @JsonProperty("subzone")
    public String getSubzone() {
        return subzone;
    }

    @JsonProperty("subzone")
    public void setSubzone(String subzone) {
        this.subzone = subzone;
    }

    @JsonProperty("subzone_id")
    public Integer getSubzoneId() {
        return subzoneId;
    }

    @JsonProperty("subzone_id")
    public void setSubzoneId(Integer subzoneId) {
        this.subzoneId = subzoneId;
    }

    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
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
