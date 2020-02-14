package com.liangwei.clidemo.command;

import com.liangwei.clidemo.service.UserService;
import com.liangwei.clidemo.shell.ShellHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@ShellComponent
public class UserCommand {
    @Autowired
    ShellHelper shellHelper;

    @Autowired
    InputReader inputReader;

    @Autowired
    UserService userService;

    @ShellMethod("Create new user with supplied username")
    public void createUser(@ShellOption({"-U", "--username"}) String username) {
        if (userService.exists(username)) {
            shellHelper.printError(
                    String.format("User with username='%s' already exists --> ABORTING", username)
            );
            return;
        }
    }
}