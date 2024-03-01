package com.example.practicaintermodular.ModelosDeDatos;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface ApiInterface {

    // Métodos para Productos
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

    // Métodos para Clientes
    @GET("clientes")
    Call<List<Cliente>> listarTodosLosClientes();

    @GET("clientes/nif/{nif}")
    Call<Cliente> obtenerClientePorNif(@Path("nif") String nif);

    @POST("clientes")
    Call<Cliente> agregarCliente(@Body Cliente cliente);

    @PUT("clientes/nif/{nif}")
    Call<Cliente> actualizarClientePorNif(@Path("nif") String nif, @Body Cliente cliente);

    @DELETE("clientes/nif/{nif}")
    Call<Void> eliminarClientePorNif(@Path("nif") String nif);

    // Métodos para Ventas
    @GET("ventas")
    Call<List<Venta>> listarTodasLasVentas();

    @GET("ventas/{id}")
    Call<Venta> obtenerVentaPorId(@Path("id") Long id);

    @POST("ventas")
    Call<Venta> agregarVenta(@Body Venta venta);

    @DELETE("ventas/{id}")
    Call<Void> eliminarVenta(@Path("id") Long id);

    // Aquí puedes agregar más métodos según los requerimientos de tu API
}

