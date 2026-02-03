package com.hm.UserMicroservice.DTO;

import io.micrometer.common.lang.NonNull;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UserPatchDTO {
 

    @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private String name;

    @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private String email;

    @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private Integer age;
}
