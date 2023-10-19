package ir.holidaytrip.bus.model.regions;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Type {
    @JsonProperty("TypeID")
    private Integer typeID;
    @JsonProperty("TypeTitle")
    private String typeTitle;
}
