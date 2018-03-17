package com.oversee.overseeapi.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Alek Ivanovski on 3/17/2018.
 */
@Entity
@Table(name = "portfolios")
public class Portfolio {

    @Id
    public String id;

}
