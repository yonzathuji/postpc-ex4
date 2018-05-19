package postpc.yonz.postpc_ex4;

import android.media.Image;

import com.google.gson.JsonElement;


import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Headers;
import retrofit.http.Path;

/**
 * AppWell.org
 * Created by dmitrijtrandin on 12.06.15.
 */
public interface ImgurService {

    @Headers("Authorization: Client-ID " + Config.CLIENT_ID)
    @GET("/album/{albumHash}")
    void getAlbumImages(@Path("albumHash") String albumHash,  Callback<JsonElement> cb);
}
