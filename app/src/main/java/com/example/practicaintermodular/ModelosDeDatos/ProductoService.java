package com.example.practicaintermodular.ModelosDeDatos;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface ProductoService {

    @GET("productos")
    Call<List<Producto>> listarTodosLosProductos();

    @GET("productos/{id}")
    Call<Producto> obtenerProductoPorId(@Path("id") Long id);

    @POST("productos")
    Call<Producto> agregarProducto(@Body Producto producto);

    @PUT("productos/{id}")
    Call<Producto> actualizarProducto(@Path("id") Long id, @Body Producto producto);

    @DELETE("productos/{id}")
    Call<Void> eliminarProducto(@Path("id") Long id);
}

