package taxi.calling.service.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import taxi.calling.service.domain.*;
import taxi.calling.service.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class TaxiDriverInfoUpdated extends AbstractEvent {

    public TaxiDriverInfoUpdated(TaxiDriver aggregate) {
        super(aggregate);
    }

    public TaxiDriverInfoUpdated() {
        super();
    }
}
//>>> DDD / Domain Event
