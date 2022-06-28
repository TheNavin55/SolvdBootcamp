package com.qaprosoft.carina.demo;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.api.APIMethodPoller;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.demo.api.DeleteUser;
import com.qaprosoft.carina.demo.api.GetWeatherByLatLon;
import com.qaprosoft.carina.demo.api.GetWeatherByCity;
import com.qaprosoft.carina.demo.api.PostWeather;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import java.lang.invoke.MethodHandles;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class APITest implements IAbstractTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @Test()
    @MethodOwner(owner = "cristian")
    public void GetWeatherByLatLon() throws Exception{
        LOGGER.info("test");
        GetWeatherByLatLon api = new GetWeatherByLatLon();
        api.callAPIExpectSuccess();
        api.validateResponseAgainstSchema("api/weather/_get/rs.schema");
    }

    @Test()
    @MethodOwner(owner = "cristian")
    public void GetWeatherByCity() throws Exception{
        LOGGER.info("test");
        GetWeatherByCity api = new GetWeatherByCity();
        api.callAPIExpectSuccess();
        api.validateResponseAgainstSchema("api/weather/_get/rs.schema");
    }

    @Test()
    @MethodOwner(owner = "cristian")
    public void PostWeather() throws Exception{
        LOGGER.info("test");
        PostWeather api = new PostWeather();

        AtomicInteger counter = new AtomicInteger(0);

        api.callAPIWithRetry()
                .withLogStrategy(APIMethodPoller.LogStrategy.ALL)
                .peek(rs -> counter.getAndIncrement())
                .until(rs -> counter.get() == 4)
                .pollEvery(1, ChronoUnit.SECONDS)
                .stopAfter(10, ChronoUnit.SECONDS)
                .execute();
        api.validateResponse();
    }

    @Test()
    @MethodOwner(owner = "cristian")
    public void DeleteUser() throws Exception{
        DeleteUser api = new DeleteUser();
        api.expectResponseStatus(HttpResponseStatusType.OK_200);
        api.callAPIExpectSuccess();
        api.validateResponse();
    }
}
