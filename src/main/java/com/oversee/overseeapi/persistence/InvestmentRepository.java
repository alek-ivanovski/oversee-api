package com.oversee.overseeapi.persistence;

import com.oversee.overseeapi.model.Investment;

import java.util.Optional;

/**
 * Created by Alek Ivanovski on 3/18/2018.
 */
public interface InvestmentRepository {

    Investment save(Investment investment);

    Optional<Investment> findOne(Long id);

    void delete(Long id);

}
