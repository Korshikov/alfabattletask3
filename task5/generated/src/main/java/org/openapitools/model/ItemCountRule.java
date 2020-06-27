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
* Параметры скидки формата \&quot;N+k\&quot; (N+k единиц товара по цене N единиц)
*/
    @ApiModel(description = "Параметры скидки формата \"N+k\" (N+k единиц товара по цене N единиц)")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-06-27T13:37:56.950+03:00[Europe/Moscow]")

@Getter
@Setter
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ItemCountRule   {
        @JsonProperty("bonusQuantity")
        private Integer bonusQuantity;

        @JsonProperty("itemId")
        private String itemId;

        @JsonProperty("shopId")
        private Integer shopId;

        @JsonProperty("triggerQuantity")
        private Integer triggerQuantity;




}

