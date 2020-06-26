package com.gavilan.urlshorter.model.services;

import com.gavilan.urlshorter.model.domain.Url;

public interface UrlService {

    Url generarShortUrl(Url url);

    Url obtenerUrl(String shortUrl);

}
