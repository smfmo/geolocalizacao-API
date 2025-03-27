package com.geolocalizacaoip.samuel.controller;
import com.geolocalizacaoip.samuel.model.IpInformation;
import com.geolocalizacaoip.samuel.service.IpInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IpInformationController {

    private final IpInformationService ipInformationService;

    @Autowired
    public IpInformationController(IpInformationService ipInformationService) {
        this.ipInformationService = ipInformationService;
    }

    @GetMapping("/ipinfo")
    public String getIpInfo(@RequestParam(name = "ip") String ip,
                            Model model) {
        System.out.println("IP recebido: " + ip); // Log de depuração

        if (ip != null && !ip.isEmpty()) {
            IpInformation ipInfo = ipInformationService.BuscarIp(ip);
            model.addAttribute("ipInfo", ipInfo);
        }
        return "/ipinfo";
    }

}
