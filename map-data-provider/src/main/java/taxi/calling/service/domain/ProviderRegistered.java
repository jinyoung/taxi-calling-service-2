package taxi.calling.service.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import taxi.calling.service.domain.*;
import taxi.calling.service.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class ProviderRegistered extends AbstractEvent {

    public ProviderRegistered(MapDataProvider aggregate) {
        super(aggregate);
    }

    public ProviderRegistered() {
        super();
    }
}
//>>> DDD / Domain Event
