package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
    import javax.validation.Valid;
    import javax.validation.constraints.*;

  import lombok.*;

            /**
* Результат расчета цены для одной позиции
*/
    @ApiModel(description = "Результат расчета цены для одной позиции")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-06-27T13:37:56.950+03:00[Europe/Moscow]")

@Getter
@Setter
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class FinalPricePosition   {
        @JsonProperty("id")
        private String id;

        @JsonProperty("name")
        private String name;

        @JsonProperty("price")
        private BigDecimal price;

        @JsonProperty("regularPrice")
        private BigDecimal regularPrice;




}

