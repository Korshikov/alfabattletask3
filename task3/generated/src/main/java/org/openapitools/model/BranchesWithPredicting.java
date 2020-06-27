package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

            /**
* BranchesWithPredicting
*/
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-06-27T13:51:53.205+03:00[Europe/Moscow]")

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BranchesWithPredicting  extends Branches {
        @JsonProperty("dayOfWeek")
        private Integer dayOfWeek;

        @JsonProperty("hourOfDay")
        private Integer hourOfDay;

        @JsonProperty("predicting")
        private Long predicting;

}

