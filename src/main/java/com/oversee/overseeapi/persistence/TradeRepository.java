package com.oversee.overseeapi.persistence;

import com.oversee.overseeapi.model.Trade;

import java.util.Optional;

/**
 * Created by Alek Ivanovski on 3/17/2018.
 */
public interface TradeRepository {

    Trade save(Trade trade);

    Optional<Trade> findOne(Long id);

    void delete(Trade trade);

}
