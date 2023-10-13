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
// @RequestMapping(value="/platformOperators")
@Transactional
public class PlatformOperatorController {

    @Autowired
    PlatformOperatorRepository platformOperatorRepository;

    @RequestMapping(
        value = "platformOperators/{id}/",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public PlatformOperator updatePlatformOperatorInfo(
        @PathVariable(value = "id") String id,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println(
            "##### /platformOperator/updatePlatformOperatorInfo  called #####"
        );
        Optional<PlatformOperator> optionalPlatformOperator = platformOperatorRepository.findById(
            id
        );

        optionalPlatformOperator.orElseThrow(() ->
            new Exception("No Entity Found")
        );
        PlatformOperator platformOperator = optionalPlatformOperator.get();
        platformOperator.updatePlatformOperatorInfo();

        platformOperatorRepository.save(platformOperator);
        return platformOperator;
    }
}
//>>> Clean Arch / Inbound Adaptor
