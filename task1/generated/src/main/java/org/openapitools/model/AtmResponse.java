package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
    import javax.validation.Valid;
    import javax.validation.constraints.*;

  import lombok.*;

            /**
* AtmResponse
*/
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-06-27T15:58:16.013+03:00[Europe/Moscow]")

@Getter
@Setter
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AtmResponse   {
        @JsonProperty("city")
        private String city;

        @JsonProperty("deviceId")
        private Integer deviceId;

        @JsonProperty("latitude")
        private String latitude;

        @JsonProperty("location")
        private String location;

        @JsonProperty("longitude")
        private String longitude;

        @JsonProperty("payments")
        private Boolean payments;




}

