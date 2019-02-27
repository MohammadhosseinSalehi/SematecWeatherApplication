package salehi.mohammadhossein.sematecweatherapplication.UI;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import salehi.mohammadhossein.sematecweatherapplication.Model.Weather;

import static salehi.mohammadhossein.sematecweatherapplication.Constants.CITY_KEY;

public interface DaileForecastClient {


    @GET("daily/5day/"+CITY_KEY)
    Call<Weather> Current_Weather_call(@Query("apikey") String apikey,
                                       @Query("language") String language,
                                       @Query("details") Boolean details,
                                       @Query("metric") Boolean metric

    );
}
