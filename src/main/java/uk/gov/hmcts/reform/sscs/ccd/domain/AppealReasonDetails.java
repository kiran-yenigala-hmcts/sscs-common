package uk.gov.hmcts.reform.sscs.ccd.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Value;

@JsonIgnoreProperties(ignoreUnknown = true)
@Value
@Builder(toBuilder = true)
public class AppealReasonDetails {
    private String reason;
    private String description;

    @JsonCreator
    public AppealReasonDetails(@JsonProperty("reason") String reason,
                               @JsonProperty("description") String description) {
        this.reason = reason;
        this.description = description;
    }
}
