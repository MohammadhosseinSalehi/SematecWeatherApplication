package salehi.mohammadhossein.sematecweatherapplication.UI;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import salehi.mohammadhossein.sematecweatherapplication.Model.City;

public interface CityClient {

    @GET("cities/search")
    Call<City> City_key (@Query("apikey") String apikey,
                         @Query("q") String cityName,
                         @Query("language") String language,
                         @Query("details") Boolean details,
                         @Query("offset") Integer offset,
                         @Query("alias") String alias
                         );

}

/*    @POST("token")
    @FormUrlEncoded
    @Headers({  "Content-Type: application/x-www-form-urlencoded",
                "clientId: IOSv1",
                "clientSecret: taasv1",
                "role: user",
                "cache-control: no-cache",
                })
    Call<> Login(
            @Field("grant_type") String grant_type,
            @Field("username") String username,
            @Field("password") String password
    );*/
