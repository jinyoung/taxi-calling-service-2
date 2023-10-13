package taxi.calling.service.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import taxi.calling.service.domain.*;
import taxi.calling.service.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class ProviderInfoUpdated extends AbstractEvent {

    public ProviderInfoUpdated(MapDataProvider aggregate) {
        super(aggregate);
    }

    public ProviderInfoUpdated() {
        super();
    }
}
//>>> DDD / Domain Event
