package in.n2w.dtos.downstream;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@ToString
public class DownstreamCity {

    @Setter
    @Getter
    @Accessors(chain = true)
    private String cityName;

    @Setter
    @Getter
    @Accessors(chain = true)
    private String centralizedPostalCode;

}