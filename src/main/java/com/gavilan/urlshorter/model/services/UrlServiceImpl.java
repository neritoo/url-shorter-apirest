package com.gavilan.urlshorter.model.services;

import com.aventrix.jnanoid.jnanoid.NanoIdUtils;
import com.gavilan.urlshorter.model.domain.Url;
import com.gavilan.urlshorter.model.repository.UrlRepository;
import org.springframework.stereotype.Service;

@Service
public class UrlServiceImpl implements UrlService {
    private final UrlRepository urlRepository;

    public UrlServiceImpl(UrlRepository urlRepository) {
        this.urlRepository = urlRepository;
    }

    @Override
    public Url generarShortUrl(Url url) {
        String id = NanoIdUtils.randomNanoId();
        url.setShortUrl(id);
        return this.urlRepository.save(url);
    }

    @Override
    public Url obtenerUrl(String shortUrl) {
        return urlRepository.findByShortUrl(shortUrl);
    }
}
