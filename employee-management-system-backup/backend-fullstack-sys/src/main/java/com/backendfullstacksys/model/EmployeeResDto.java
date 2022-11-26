package com.backendfullstacksys.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeResDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String emailId;
}
