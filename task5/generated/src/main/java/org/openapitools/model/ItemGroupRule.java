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
* Параметры скидки при покупке связанных товаров
*/
    @ApiModel(description = "Параметры скидки при покупке связанных товаров")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-06-27T13:37:56.950+03:00[Europe/Moscow]")

@Getter
@Setter
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ItemGroupRule   {
        @JsonProperty("discount")
        private Double discount;

        @JsonProperty("groupId")
        private String groupId;

        @JsonProperty("shopId")
        private Integer shopId;




}

