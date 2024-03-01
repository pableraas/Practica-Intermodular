package com.example.practicaintermodular.ModelosDeDatos;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface ClienteService {

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
}
