package ir.holidaytrip.bus.service.regions;

import ir.holidaytrip.bus.dao.RegionDao;
import ir.holidaytrip.bus.model.regions.CityMapping;
import ir.holidaytrip.bus.model.regions.CityResponse;
import ir.holidaytrip.bus.model.regions.DetaiCityResponse;
import ir.holidaytrip.bus.model.regions.RegionsResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Slf4j
@Service
@RequiredArgsConstructor
public class RegionsService {
    private final RestTemplate restTemplate;

    private final RegionDao regionDao;
    public List<RegionsResponse> allBusRegion(){
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<>(headers);
        restTemplate
                .exchange("https://Api.hiholiday.ir/v4/Bus/Regions/aedc6630-91a2-4d2f-8de5-8ad52e1c5452", HttpMethod.POST, entity, RegionsResponse.class);
        return null;
    }
    @Transactional
    public List<CityResponse> allCity(){
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<>(headers);
        List<Map<String,String>> cityResponses = restTemplate
                .exchange("https://iran-locations-api.vercel.app/api/v1/states", HttpMethod.GET, entity, List.class).getBody();

            for(int i =0 ; i<cityResponses.size();i++){
            DetaiCityResponse detaiCityResponse = restTemplate
                    .exchange("https://iran-locations-api.vercel.app/api/v1/cities?state=" + cityResponses.get(0).get("name"), HttpMethod.GET, entity, DetaiCityResponse.class).getBody();
            CityMapping cityMapping = new CityMapping();
            cityMapping.setCenter(cityResponses.get(i).get("center"));
            detaiCityResponse.getCities().forEach(p-> {
                cityMapping.setName(p.getName());
                cityMapping.setLng(Double.valueOf(p.getLatitude()));
                cityMapping.setLng(Double.valueOf(p.getLongitude()));
                save(cityMapping);
        });
          }
        return null;
    }

    @Transactional
    public void save(CityMapping cityMapping){
        regionDao.save(cityMapping);
        System.out.println("SAAAVED");
    }

}
