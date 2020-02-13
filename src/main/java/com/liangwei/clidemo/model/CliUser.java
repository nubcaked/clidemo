package com.liangwei.clidemo.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class CliUser {
    private Long id;
    private String username;
    private String password;
    private String fullName;
    private Gender gender;
    private boolean superuser;
}
