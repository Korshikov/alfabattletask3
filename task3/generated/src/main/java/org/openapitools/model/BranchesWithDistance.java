package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BranchesWithDistance extends Branches {
@JsonProperty("distance")
private Long distance;

}

