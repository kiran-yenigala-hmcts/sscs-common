package uk.gov.hmcts.reform.sscs.ccd.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DwpResponseDocument {
    private DocumentLink documentLink;
    private String documentFileName;

    @JsonCreator
    public DwpResponseDocument(@JsonProperty("documentLink") DocumentLink documentLink,
                               @JsonProperty("documentFileName") String documentFileName) {
        this.documentLink = documentLink;
        this.documentFileName = documentFileName;
    }
}
