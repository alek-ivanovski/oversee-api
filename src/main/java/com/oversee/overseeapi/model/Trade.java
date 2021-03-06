package com.oversee.overseeapi.model;

import org.elasticsearch.search.DocValueFormat;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Alek Ivanovski on 3/17/2018.
 */

@Entity
@Table(name = "trades")
public class Trade {

    @Id
    @GeneratedValue
    @Column(name = "trade_id")
    public Long id;

    public String symbol1;

    public String symbol2;

    public String type;

    public Long units;

    public Long execute_at;

    public Date date;

    @ManyToOne(fetch=FetchType.LAZY)
//    IMPORTANT: @NotFound is only a temporary solution, may cause problems in production
    @NotFound(action = NotFoundAction.IGNORE)
    public Portfolio owner;

}
