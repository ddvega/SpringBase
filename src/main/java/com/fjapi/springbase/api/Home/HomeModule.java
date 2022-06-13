package com.fjapi.springbase.api.Home;

import com.fjapi.springbase.model.JwtRequest;
import com.fjapi.springbase.model.JwtResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface HomeModule
{
    @GetMapping("/")
    String home();

    @PostMapping("/authenticate")
    JwtResponse authenticate(@RequestBody JwtRequest jwtRequest) throws Exception;

}
