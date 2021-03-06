package uk.gov.hmcts.reform.sscs.ccd.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Value;

@JsonIgnoreProperties(ignoreUnknown = true)
@Value
@Builder(toBuilder = true)
public class Document implements Comparable<Document> {
    private DocumentDetails value;

    @JsonCreator
    public Document(@JsonProperty("value") DocumentDetails value) {
        this.value = value;
    }

    @Override
    public int compareTo(Document o) {
        return value.getDateReceived().compareTo(o.getValue().getDateReceived());
    }
}
