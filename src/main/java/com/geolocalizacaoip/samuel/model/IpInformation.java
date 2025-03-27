package com.geolocalizacaoip.samuel.model;

import lombok.Data;

@Data
public class IpInformation { //cada atributo corresponde a uma propriedade no JSON retornado pela API
    private String status;
    private String country;
    private String countryCode;
    private String region;
    private String regionName;
    private String city;
    private String zip;
    private String lat;
    private String lon;
    private String timezone;
    private String isp;
    private String org;
    private String as;
    private String query;

}
