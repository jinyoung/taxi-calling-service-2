package taxi.calling.service.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import taxi.calling.service.domain.*;

@Component
public class TaxiDriverHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<TaxiDriver>> {

    @Override
    public EntityModel<TaxiDriver> process(EntityModel<TaxiDriver> model) {
        model.add(
            Link.of(model.getRequiredLink("self").getHref() + "/").withRel("")
        );

        return model;
    }
}
