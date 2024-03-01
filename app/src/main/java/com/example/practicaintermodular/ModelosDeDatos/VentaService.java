package com.example.practicaintermodular.ModelosDeDatos;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface VentaService {

    @GET("ventas")
    Call<List<Venta>> listarTodasLasVentas();

    @GET("ventas/{id}")
    Call<Venta> obtenerVentaPorId(@Path("id") Long id);

    @POST("ventas")
    Call<Venta> agregarVenta(@Body Venta venta);

    @DELETE("ventas/{id}")
    Call<Void> eliminarVenta(@Path("id") Long id);
}
