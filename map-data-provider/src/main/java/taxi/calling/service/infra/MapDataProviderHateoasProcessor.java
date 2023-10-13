package taxi.calling.service.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import taxi.calling.service.domain.*;

@Component
public class MapDataProviderHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<MapDataProvider>> {

    @Override
    public EntityModel<MapDataProvider> process(
        EntityModel<MapDataProvider> model
    ) {
        model.add(
            Link.of(model.getRequiredLink("self").getHref() + "/").withRel("")
        );

        return model;
    }
}
