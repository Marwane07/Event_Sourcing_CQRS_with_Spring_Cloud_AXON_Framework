package commands.controllers;

import commonapi.dtos.CreateAccountRequestDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/commands/account")
public class AccountCommandController  {
    private CommandBus commandBus;
    @PostMapping(path = "/create")
    public String createAccount(@RequestBody CreateAccountRequestDTO request){

    }

}
