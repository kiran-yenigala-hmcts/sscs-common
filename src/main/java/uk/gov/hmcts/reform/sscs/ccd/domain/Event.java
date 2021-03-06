package uk.gov.hmcts.reform.sscs.ccd.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Value;

@JsonIgnoreProperties(ignoreUnknown = true)
@Value
@Builder(toBuilder = true)
public class Event implements Comparable<Event> {
    EventDetails value;

    @JsonCreator
    public Event(@JsonProperty("value") EventDetails value) {
        this.value = value;
    }

    @Override
    public int compareTo(Event o) {
        return value.getDate().compareTo(o.getValue().getDate());
    }
}
