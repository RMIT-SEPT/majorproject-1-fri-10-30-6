package flightbooking.backend.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import flightbooking.backend.dao.CustomerInfoRepo;
import flightbooking.backend.dao.FlightInfoRepo;
import flightbooking.backend.model.CustomerInfo;
import flightbooking.backend.model.FlightInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("api/v1/FlightInfo")
@RestController
public class FlightInfoController {

    @Autowired
    private FlightInfoRepo flightInfoRepo;

    @PostMapping
    @JsonProperty
    @RequestMapping("addCustomer")
    public void addFlightInfo(@RequestBody FlightInfo flightInfo) {
        flightInfoRepo.save(flightInfo);
    }
    @PostMapping @JsonProperty @RequestMapping("deleteCustomer")
    public void deleteFlightInfo(@RequestBody FlightInfo flightInfo) {
        flightInfoRepo.delete(flightInfo);
    }

    @PostMapping @JsonProperty @RequestMapping("getInfo")
    public void searchFlightInfo(@RequestParam String depature, String arrival,String location_From, String location_To) {
        flightInfoRepo.findBydeparturearrivallocation_Fromlocation_TototalSeats(depature,arrival,location_From,location_To);
    }

}
