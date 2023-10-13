package taxi.calling.service.infra;

import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import taxi.calling.service.domain.*;

//<<< Clean Arch / Inbound Adaptor

@RestController
// @RequestMapping(value="/taxiDrivers")
@Transactional
public class TaxiDriverController {

    @Autowired
    TaxiDriverRepository taxiDriverRepository;

    @RequestMapping(
        value = "taxiDrivers/{id}/",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public TaxiDriver updateTaxiDriverInfo(
        @PathVariable(value = "id") String id,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println(
            "##### /taxiDriver/updateTaxiDriverInfo  called #####"
        );
        Optional<TaxiDriver> optionalTaxiDriver = taxiDriverRepository.findById(
            id
        );

        optionalTaxiDriver.orElseThrow(() -> new Exception("No Entity Found"));
        TaxiDriver taxiDriver = optionalTaxiDriver.get();
        taxiDriver.updateTaxiDriverInfo();

        taxiDriverRepository.save(taxiDriver);
        return taxiDriver;
    }
}
//>>> Clean Arch / Inbound Adaptor
