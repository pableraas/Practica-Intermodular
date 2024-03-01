package com.example.practicaintermodular.ModelosDeDatos;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

    private static final String BASE_URL = "http://10.0.2.2:8080/"; // Ajusta la URL base según sea necesario
    private static Retrofit retrofit = null;

    public static Retrofit getRetrofitInstance() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }

    public static ProductoService getProductoService() {
        return getRetrofitInstance().create(ProductoService.class);
    }

    public static ClienteService getClienteService() {
        return getRetrofitInstance().create(ClienteService.class);
    }

    public static VentaService getVentaService() {
        return getRetrofitInstance().create(VentaService.class);
    }
}

