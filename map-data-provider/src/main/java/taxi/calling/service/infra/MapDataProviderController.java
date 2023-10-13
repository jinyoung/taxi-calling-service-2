package taxi.calling.service.infra;
import taxi.calling.service.domain.*;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;

//<<< Clean Arch / Inbound Adaptor

@RestController
// @RequestMapping(value="/mapDataProviders")
@Transactional
public class MapDataProviderController {
    @Autowired
    MapDataProviderRepository mapDataProviderRepository;




    @RequestMapping(value = "mapDataProviders/{id}/",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8")
    public MapDataProvider updateProviderInfo(@PathVariable(value = "id")  id, HttpServletRequest request, HttpServletResponse response) throws Exception {
            System.out.println("##### /mapDataProvider/updateProviderInfo  called #####");
            Optional<MapDataProvider> optionalMapDataProvider = mapDataProviderRepository.findById(id);
            
            optionalMapDataProvider.orElseThrow(()-> new Exception("No Entity Found"));
            MapDataProvider mapDataProvider = optionalMapDataProvider.get();
            mapDataProvider.updateProviderInfo();
            
            mapDataProviderRepository.save(mapDataProvider);
            return mapDataProvider;
            
    }
    



}
//>>> Clean Arch / Inbound Adaptor
