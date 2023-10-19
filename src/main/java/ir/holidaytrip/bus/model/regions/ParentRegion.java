package ir.holidaytrip.bus.model.regions;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ParentRegion {
    @JsonProperty("RegionID")
    private Integer regionID;
    @JsonProperty("RegionName")
    private String regionName;
    @JsonProperty("FaRegionName")
    private String faRegionName;
    @JsonProperty("Code")
    private String code;
    @JsonProperty("Type")
    private Object type;
    @JsonProperty("ParentRegion")
    private Object parentRegion;

}
