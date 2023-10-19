package ir.holidaytrip.bus.model.regions;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Result {
    @JsonProperty("Type")
    private String type;
    @JsonProperty("Message")
    private String message;
    @JsonProperty("FaMessage")
    private Object faMessage;
    @JsonProperty("Code")
    private Integer code;
}
