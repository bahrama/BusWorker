package ir.holidaytrip.bus.model.regions;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class DetaiCityResponse {
    private String name;
    private String center;
    private String latitude;
    private String longitude;
    private List<CityResponse> cities;
    private Integer id;
}
