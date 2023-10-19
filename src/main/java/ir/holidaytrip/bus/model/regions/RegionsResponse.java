package ir.holidaytrip.bus.model.regions;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class RegionsResponse {
    @JsonProperty("Result")
    private Result result;
    @JsonProperty("Regions")
    private List<Region> regions;
}
