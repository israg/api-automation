package models.response;

import com.fasterxml.jackson.annotation.JsonProperty;

//@JsonIgnoreProperties(ignoreUnknown = true)
public class GenerateClientLibraryResponse {

    @JsonProperty("code")
    public boolean code;

    @JsonProperty("link")
    public String link;
}
