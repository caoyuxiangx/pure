package io.manager.bangche.agency.network.service;

import io.manager.bangche.agency.bean.NewsDetail;
import io.manager.bangche.agency.bean.NewsList;
import io.manager.bangche.agency.network.manager.RetrofitManager;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by laucherish on 16/3/15.
 */
public interface ZhihuService {

    @Headers(RetrofitManager.CACHE_CONTROL_AGE + RetrofitManager.CACHE_STALE_SHORT)
    @GET("stories/latest")
    Observable<NewsList> getLatestNews();

    @Headers(RetrofitManager.CACHE_CONTROL_AGE + RetrofitManager.CACHE_STALE_LONG)
    @GET("stories/before/{date}")
    Observable<NewsList> getBeforeNews(@Path("date") String date);

    @Headers(RetrofitManager.CACHE_CONTROL_AGE + RetrofitManager.CACHE_STALE_LONG)
    @GET("story/{id}")
    Observable<NewsDetail> getNewsDetail(@Path("id") int id);
}
