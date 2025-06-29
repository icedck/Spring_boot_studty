package com.example.identity_service.dto.request;

import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserCreationRequest {
    @Size(min = 3, message = "USER_INVALID")
    String name;

    @Size(min = 8, message = "PASS_INVALID")
    String password;
    String firstName;
    String lastName;
    
    LocalDate birthDate;
}
