package test;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonView;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Response<T> {
    @JsonView(EntityVisibility.Public.class)
    private T result;

    public Response(T response) {
        result = response;
    }


}