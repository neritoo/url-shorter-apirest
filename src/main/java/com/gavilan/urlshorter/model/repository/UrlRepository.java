package com.gavilan.urlshorter.model.repository;

import com.gavilan.urlshorter.model.domain.Url;
import org.springframework.data.repository.CrudRepository;

public interface UrlRepository extends CrudRepository<Url, Long> {

    Url findByShortUrl(String termino);

}
