package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.ItemCountRule;
import org.openapitools.model.ItemGroupRule;
import org.openapitools.model.LoyaltyCardRule;
import org.openapitools.jackson.nullable.JsonNullable;
    import javax.validation.Valid;
    import javax.validation.constraints.*;

  import lombok.*;

            /**
* Матрица промо-механик
*/
    @ApiModel(description = "Матрица промо-механик")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-06-27T13:37:56.950+03:00[Europe/Moscow]")

@Getter
@Setter
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PromoMatrix   {
        @JsonProperty("itemCountRules")
        @Valid
        private List<ItemCountRule> itemCountRules = null;

        @JsonProperty("itemGroupRules")
        @Valid
        private List<ItemGroupRule> itemGroupRules = null;

        @JsonProperty("loyaltyCardRules")
        @Valid
        private List<LoyaltyCardRule> loyaltyCardRules = null;




}

