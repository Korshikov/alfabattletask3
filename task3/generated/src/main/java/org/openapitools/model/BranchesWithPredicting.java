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
* BranchesWithPredicting
*/
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-06-27T13:51:53.205+03:00[Europe/Moscow]")

@Getter
@Setter
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BranchesWithPredicting   {
        @JsonProperty("address")
        private String address;

        @JsonProperty("dayOfWeek")
        private Integer dayOfWeek;

        @JsonProperty("hourOfDay")
        private Integer hourOfDay;

        @JsonProperty("id")
        private Long id;

        @JsonProperty("lat")
        private Double lat;

        @JsonProperty("lon")
        private Double lon;

        @JsonProperty("predicting")
        private Long predicting;

        @JsonProperty("title")
        private String title;




}

