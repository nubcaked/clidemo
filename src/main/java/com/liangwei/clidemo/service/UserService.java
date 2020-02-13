package com.liangwei.clidemo.service;

import com.liangwei.clidemo.model.CliUser;

public interface UserService {
    boolean exists(String username);
    CliUser create(CliUser user);
    CliUser update(CliUser user);
}
