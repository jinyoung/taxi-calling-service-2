package taxi.calling.service.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import taxi.calling.service.domain.*;
import taxi.calling.service.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class PlatformOperatorInfoUpdated extends AbstractEvent {

    public PlatformOperatorInfoUpdated(PlatformOperator aggregate) {
        super(aggregate);
    }

    public PlatformOperatorInfoUpdated() {
        super();
    }
}
//>>> DDD / Domain Event
