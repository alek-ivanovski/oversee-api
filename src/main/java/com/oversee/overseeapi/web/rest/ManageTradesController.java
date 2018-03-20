package com.oversee.overseeapi.web.rest;

import com.oversee.overseeapi.model.Trade;
import com.oversee.overseeapi.service.TradeManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Alek Ivanovski on 3/18/2018.
 */

@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
public class ManageTradesController {

    private TradeManagementService tradeManagementService;

    @Autowired
    public ManageTradesController(TradeManagementService tradeManagementService){
        this.tradeManagementService = tradeManagementService;
    }

    @RequestMapping(value = "trades", method = RequestMethod.POST)
    public Trade add(@RequestBody Trade trade){
        return tradeManagementService.add(trade.symbol1,
                trade.symbol2,
                trade.type,
                trade.units,
                trade.execute_at,
                trade.date,
                trade.owner);
    }

    @RequestMapping(value = "trades", method = RequestMethod.GET)
    public Iterable<Trade> getTrades(){
        return tradeManagementService.findAll();
    }
}
