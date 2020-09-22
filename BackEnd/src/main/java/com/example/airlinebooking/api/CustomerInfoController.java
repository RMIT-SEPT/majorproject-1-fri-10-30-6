package flightbooking.backend.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import flightbooking.backend.dao.CustomerInfoRepo;
import flightbooking.backend.model.CustomerInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("api/v1/customerInfo")
@RestController
public class CustomerInfoController {

    @Autowired
    private CustomerInfoRepo customerInfoRepo;

    @PostMapping @JsonProperty @RequestMapping("addCustomer")
    public void addCustomerInfo(@RequestBody CustomerInfo customerInfo) {
        customerInfoRepo.save(customerInfo);
    }
    @PostMapping @JsonProperty @RequestMapping("deleteCustomer")
    public void deleteCustomerInfo(@RequestBody CustomerInfo customerInfo) {
        customerInfoRepo.delete(customerInfo);
    }
}
