package net.rain.service.rpc;

/**
 * @author Rainy-Heights
 * @version 1.0
 * @Date 2023/7/11 11:31
 */
public interface WeatherInterface {
    //更为抽象的远程调用

    String getWeather(String cityName);
}
