package ir.holidaytrip.bus.view;

import ir.holidaytrip.bus.service.regions.RegionsService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/regions")
@RequiredArgsConstructor
public class RegionsApi {

    private final RegionsService regionsService;

    @GetMapping
    public ResponseEntity<?> findMeeting(){
        return new ResponseEntity<>(regionsService.allBusRegion(), HttpStatus.OK);
    }
}
