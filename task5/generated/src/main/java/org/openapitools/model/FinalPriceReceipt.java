package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.FinalPricePosition;
import org.openapitools.jackson.nullable.JsonNullable;
    import javax.validation.Valid;
    import javax.validation.constraints.*;

  import lombok.*;

            /**
* Результат расчета корзины
*/
    @ApiModel(description = "Результат расчета корзины")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-06-27T13:37:56.950+03:00[Europe/Moscow]")

@Getter
@Setter
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class FinalPriceReceipt   {
        @JsonProperty("discount")
        private BigDecimal discount;

        @JsonProperty("positions")
        @Valid
        private List<FinalPricePosition> positions = null;

        @JsonProperty("total")
        private BigDecimal total;




}

