package in.n2w.dtos.downstream;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@ToString
public class DownstreamState {

    @Setter
    @Getter
    @Accessors(chain = true)
    private String stateCode;

    @Setter
    @Getter
    @Accessors(chain = true)
    private String stateName;

}