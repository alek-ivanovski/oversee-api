package com.oversee.overseeapi.service;

import com.oversee.overseeapi.model.Portfolio;
import com.oversee.overseeapi.model.Trade;

import java.util.Date;

/**
 * Created by Alek Ivanovski on 3/18/2018.
 */
public interface TradeManagementService {

    Trade add(String symbol1, String symbol2, String type, Long units,
              Long execute_at, Date date, Portfolio owner);

}
