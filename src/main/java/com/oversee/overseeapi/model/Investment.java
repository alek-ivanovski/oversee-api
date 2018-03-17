package com.oversee.overseeapi.model;

import javax.persistence.*;

/**
 * Created by Alek Ivanovski on 3/17/2018.
 */

@Entity
@Table(name = "investments")
public class Investment {

    @Id
    @GeneratedValue
    @Column(name = "investment_id")
    public Long id;

    public String symbol1;

    public String symbol2;

    public Long units;

    public Long invested;

    public Long value;

    public Long pldollar;

    public Long plProcent;

}


