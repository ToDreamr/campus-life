package net.rain.service.rpc;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

/**
 * @author Rainy-Heights
 * @version 1.0
 * @Date 2023/7/11 10:51
 */
@Service
public interface RemoteProcedureService {
    Mono<String> getWeather(String cityName);
}
