package com.example.polls.payload;

import javax.validation.constraints.NotBlank;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by rajeevkumarsingh on 02/08/17.
 */

@Data
@Getter
@Setter
public class LoginRequest {
    @NotBlank
    private String phone;

}
