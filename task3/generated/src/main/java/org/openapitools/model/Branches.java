package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

            /**
* Branches
*/
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-06-27T13:51:53.205+03:00[Europe/Moscow]")

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Branches   {
        @JsonProperty("address")
        private String address;

        @JsonProperty("id")
        private Long id;

        @JsonProperty("lat")
        private Double lat;

        @JsonProperty("lon")
        private Double lon;

        @JsonProperty("title")
        private String title;




}

