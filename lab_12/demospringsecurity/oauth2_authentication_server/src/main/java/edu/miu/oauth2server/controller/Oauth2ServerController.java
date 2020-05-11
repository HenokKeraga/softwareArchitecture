package edu.miu.oauth2server.controller;

import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class Oauth2ServerController {

    @RequestMapping(value = {"/user"} )
    public Map<String,Object> user(OAuth2Authentication oAuth2Authentication){
        Map<String,Object> userInfo = new HashMap<>();
        userInfo.put("user",oAuth2Authentication.getUserAuthentication().getPrincipal());
        userInfo.put("authorities",
                AuthorityUtils.authorityListToSet(oAuth2Authentication.getUserAuthentication().getAuthorities()));

        return  userInfo;

    }
}
