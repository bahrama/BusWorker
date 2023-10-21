package ir.holidaytrip.bus.model.regions;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CityResponse {
    private String name;
    private String center;
    private String latitude;
    private String longitude;
    private Integer id;
}
