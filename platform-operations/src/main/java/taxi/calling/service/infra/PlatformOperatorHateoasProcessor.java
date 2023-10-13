package taxi.calling.service.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import taxi.calling.service.domain.*;

@Component
public class PlatformOperatorHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<PlatformOperator>> {

    @Override
    public EntityModel<PlatformOperator> process(
        EntityModel<PlatformOperator> model
    ) {
        model.add(
            Link.of(model.getRequiredLink("self").getHref() + "/").withRel("")
        );

        return model;
    }
}
