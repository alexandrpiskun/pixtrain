package com.generic.view;

import java.io.Serializable;
import java.util.Map;
import javax.faces.context.FacesContext;
import javax.faces.view.facelets.FaceletContext;
import javax.servlet.http.Cookie;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller("hwc")
@Scope("session")
public class HelloWorldController implements Serializable{

    public String authCode;

    public String getMessage() {
        return "hello world";
    }

    public String getAuthCode() {
        return authCode;
    }

    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }
    
    public boolean isFBLogged(){
        Map<String, Object> cookies = FacesContext.getCurrentInstance().getExternalContext().getRequestCookieMap();
        Cookie fb = (Cookie) cookies.get("fbsr_349298141753447");
        
        return fb != null;
    }
}
