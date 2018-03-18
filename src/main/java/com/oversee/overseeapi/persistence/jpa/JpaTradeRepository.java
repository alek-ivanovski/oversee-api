package com.oversee.overseeapi.persistence.jpa;

import com.oversee.overseeapi.model.Trade;
import com.oversee.overseeapi.persistence.TradeRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.data.repository.Repository;

/**
 * Created by Alek Ivanovski on 3/17/2018.
 */
@Profile("jpa")
public interface JpaTradeRepository extends TradeRepository,
        Repository<Trade, Long> {

}
