package ir.holidaytrip.bus.service.regions;

import ir.holidaytrip.bus.model.regions.RegionsResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class RegionsService {
    private final RestTemplate restTemplate;
    public List<RegionsResponse> allBusRegion(){
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<>(headers);
        restTemplate
                .exchange("https://Api.hiholiday.ir/v4/Bus/Regions/aedc6630-91a2-4d2f-8de5-8ad52e1c5452", HttpMethod.POST, entity, RegionsResponse.class);
        return null;
    }
}
