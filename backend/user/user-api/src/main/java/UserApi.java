import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

public interface UserApi {

    @RequestMapping(method = RequestMethod.GET, path = "/api/dimension-id/dimension-type", produces = MediaType.APPLICATION_JSON_VALUE)
    List<DimensionModel> getDimensions();
}
