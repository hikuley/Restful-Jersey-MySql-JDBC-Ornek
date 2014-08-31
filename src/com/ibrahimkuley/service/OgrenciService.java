package com.ibrahimkuley.service;

import com.ibrahimkuley.dao.OgrenciDao;
import com.ibrahimkuley.model.Ogrenci;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by halil on 15.08.2014.
 */

@Path("ogrenci")
public class OgrenciService {

    @Context
    private ServletContext context;

    @GET
    @Produces("application/json;charset=utf-8")
    public List<Ogrenci> getOgrenciList(@Context HttpServletRequest request) throws SQLException {
        List<Ogrenci> ogrenciList = OgrenciDao.ogrenciList(context);
        return ogrenciList;
    }

    @POST
    @Produces("application/json;charset=utf-8")
    public void addOgrenci() {

    }

    @PUT
    @Produces("application/json;charset=utf-8")
    public void updateOgrenci() {

    }


    @DELETE
    @Produces("application/json;charset=utf-8")
    public void deleteOgrenci() {


    }


}