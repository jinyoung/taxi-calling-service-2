package taxi.calling.service.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import taxi.calling.service.domain.*;
import taxi.calling.service.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class TaxiDriverRegistered extends AbstractEvent {

    public TaxiDriverRegistered(TaxiDriver aggregate) {
        super(aggregate);
    }

    public TaxiDriverRegistered() {
        super();
    }
}
//>>> DDD / Domain Event
