package University.service.jackson;

import java.util.List;

public interface JacksonService <T>{
    List<T> serializedEntity(String path);
}
