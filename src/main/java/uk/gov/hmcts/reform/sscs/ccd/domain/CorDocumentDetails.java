package uk.gov.hmcts.reform.sscs.ccd.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Value;

@JsonIgnoreProperties(ignoreUnknown = true)
@Value
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CorDocumentDetails {
    private SscsDocumentDetails document;
    private String questionId;

    @JsonCreator
    public CorDocumentDetails(@JsonProperty("document") SscsDocumentDetails document,
                       @JsonProperty("questionId")String questionId) {
        this.document = document;
        this.questionId = questionId;
    }
}