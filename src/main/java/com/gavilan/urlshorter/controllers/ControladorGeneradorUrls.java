package com.gavilan.urlshorter.controllers;

import com.gavilan.urlshorter.model.domain.Url;
import com.gavilan.urlshorter.model.services.UrlService;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/api")
public class ControladorGeneradorUrls {

    private final UrlService urlService;

    public ControladorGeneradorUrls(UrlService urlService) {
        this.urlService = urlService;
    }

    // Generar short.
    @PostMapping("/generar")
    public Url generarShort(@RequestBody Url url) {
        return urlService.generarShortUrl(url);
    }

    // Obtener URL a partir de un short.
    @GetMapping("/url")
    public Url obtenerShort(@RequestParam String shortUrl) {
        return urlService.obtenerUrl(shortUrl);
    }

}
