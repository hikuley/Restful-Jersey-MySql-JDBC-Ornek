package com.ibrahimkuley.managment;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by halil on 16.08.2014.
 */
public class UserCheckFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }


    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;

        HttpSession session = request.getSession();
        String sessionResult = (String) session.getAttribute("session_key");


        if (sessionResult == "true") {
            filterChain.doFilter(servletRequest, servletResponse);
        } else {
            PrintWriter out = response.getWriter();
            out.println("Oturum Açınız");
        }
    }

    @Override
    public void destroy() {

    }
}