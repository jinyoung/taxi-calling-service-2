package taxi.calling.service.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import taxi.calling.service.domain.*;
import taxi.calling.service.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class CustomerInfoUpdated extends AbstractEvent {

    public CustomerInfoUpdated(Customer aggregate) {
        super(aggregate);
    }

    public CustomerInfoUpdated() {
        super();
    }
}
//>>> DDD / Domain Event
