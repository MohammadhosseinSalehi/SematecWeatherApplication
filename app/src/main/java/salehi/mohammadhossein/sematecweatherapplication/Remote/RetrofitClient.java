package salehi.mohammadhossein.sematecweatherapplication.Remote;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static salehi.mohammadhossein.sematecweatherapplication.Constants.BASE_URL;

public class RetrofitClient {

    private static Retrofit retrofit = null;
    //private static Retrofit retrofit2 = null;
    public static Retrofit getClient() {
        if (retrofit == null) {
            // Retrofit Builder
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
/*    public static Retrofit getClient2() {
        if (retrofit2 == null) {
            // Retrofit Builder
            retrofit2 = new Retrofit.Builder()
                    .baseUrl("https://api.androidhive.info/json/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit2;
    }*/
}
