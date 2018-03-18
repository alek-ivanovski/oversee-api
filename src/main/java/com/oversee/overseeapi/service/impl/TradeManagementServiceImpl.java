package com.oversee.overseeapi.service.impl;

import com.oversee.overseeapi.model.Trade;
import com.oversee.overseeapi.persistence.TradeRepository;
import com.oversee.overseeapi.service.TradeManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by Alek Ivanovski on 3/18/2018.
 */
@Service
public class TradeManagementServiceImpl implements TradeManagementService {

    private TradeRepository tradeRepository;

    @Autowired
    public TradeManagementServiceImpl(TradeRepository tradeRepository){
        this.tradeRepository = tradeRepository;
    }

    @Override
    public Trade add(String symbol1, String symbol2, String type, Long units, Long execute_at, Date date){
        Trade trade = new Trade();
        trade.symbol1 = symbol1;
        trade.symbol2 = symbol2;
        trade.type = type;
        trade.units = units;
        trade.execute_at = execute_at;
        trade.date = date;
        return this.tradeRepository.save(trade);
    }
}
