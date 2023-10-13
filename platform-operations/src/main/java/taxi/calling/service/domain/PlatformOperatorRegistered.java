package taxi.calling.service.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import taxi.calling.service.domain.*;
import taxi.calling.service.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class PlatformOperatorRegistered extends AbstractEvent {

    public PlatformOperatorRegistered(PlatformOperator aggregate) {
        super(aggregate);
    }

    public PlatformOperatorRegistered() {
        super();
    }
}
//>>> DDD / Domain Event
