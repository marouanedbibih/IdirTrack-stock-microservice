package org.idirtrack.backend.handler;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class MyErrorRES {

    private String message;
    private List<MyFieldError> errors;
}
