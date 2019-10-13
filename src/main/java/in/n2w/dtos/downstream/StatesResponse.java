package in.n2w.dtos.downstream;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.util.Set;

/**
 * Created by Karanbir Singh on 10/13/2019.
 **/
@ToString
public class StatesResponse {

    @Setter
    @Getter
    @Accessors(chain = true)
    private Set<DownstreamState> included;

}
