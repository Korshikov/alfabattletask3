package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.ItemPosition;
import org.openapitools.jackson.nullable.JsonNullable;
    import javax.validation.Valid;
    import javax.validation.constraints.*;

  import lombok.*;

            /**
* Данные о магазине и товарах в корзине
*/
    @ApiModel(description = "Данные о магазине и товарах в корзине")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-06-27T13:37:56.950+03:00[Europe/Moscow]")

@Getter
@Setter
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ShoppingCart   {
        @JsonProperty("loyaltyCard")
        private Boolean loyaltyCard;

        @JsonProperty("positions")
        @Valid
        private List<ItemPosition> positions = null;

        @JsonProperty("shopId")
        private Integer shopId;




}

