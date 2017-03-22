package org.justin.thanos.api;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

/**
 *
 * Created by Administrator on 2017/2/3.
 */

public interface DoubanApi {


/*    Call<BookSearchResponse> getSearchBooks(@Query("q") String name,
                                            @Query("tag") String tag,
                                            @Query("start") int start,
                                            @Query("count") int count
                           );*/
    @GET("book/search")
    Call<BookSearchResponse> getSearchBooks(@QueryMap Map<String,String> options);


}
