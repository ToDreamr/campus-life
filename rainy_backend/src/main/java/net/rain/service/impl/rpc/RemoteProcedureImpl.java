package net.rain.service.impl.rpc;

import net.rain.service.rpc.RemoteProcedureService;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.HashMap;

/**
 * @author Rainy-Heights
 * @version 1.0
 * @Date 2023/7/11 10:52
 */
@Service
public class RemoteProcedureImpl implements RemoteProcedureService {
    @Override
    public Mono<String> getWeather(String cityName) {
        WebClient client=WebClient.create();
        HashMap<String, String> params= new HashMap<>();
        params.put("area",cityName);

        Mono<String> mono = client.get()
                .uri("https://ali-weather.showapi.com/area-to-weather-date?area={area}", params)
                .accept(MediaType.APPLICATION_JSON)
                .header("Authorization", "APPCODE 957d750a2caf46e5b6bebfc4f0ec00a0")
                .retrieve()
                .bodyToMono(String.class);
        return mono;
    }
}
