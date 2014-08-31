package com.ibrahimkuley.login;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;

/**
 * Created by halil on 20.08.2014.
 */
@Path("user")
public class Authencatition {


    @GET
    @Path("/login")
    @Produces("application/json;charset=utf-8") //Oturum açma
    public String login(@Context HttpServletRequest request) {
        HttpSession session = request.getSession();
        session.setAttribute("session_key", "true");
        return "Oturum açıldı.";
    }

    @GET
    @Path("/loginDestroy")
    @Produces("application/json;charset=utf-8") // Oturum kapatma
    public String loginDestroy(@Context HttpServletRequest request) {
        HttpSession session = request.getSession();
        session.removeAttribute("session_key");
        return "";
    }

}
