package com.geolocalizacaoip.samuel.service;

import com.geolocalizacaoip.samuel.model.IpInformation;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class IpInformationService {

   private final RestTemplate restTemplate;

    public IpInformationService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public IpInformation BuscarIp(String ip) {
        String url = "http://ip-api.com/json/" + ip;
        return restTemplate.getForObject(url, IpInformation.class);
    }
}
