package ir.holidaytrip.bus.model.regions;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Region {
    @JsonProperty("RegionID")
    private Integer regionID;
    @JsonProperty("RegionName")
    private String regionName;
    @JsonProperty("FaRegionName")
    private String faRegionName;
    @JsonProperty("Code")
    private String code;
    @JsonProperty("Type")
    private Type type;
    @JsonProperty("ParentRegion")
    private ParentRegion parentRegion;
}
