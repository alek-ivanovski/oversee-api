package com.oversee.overseeapi.persistence.jpa;

import com.oversee.overseeapi.model.Investment;
import com.oversee.overseeapi.persistence.InvestmentRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.data.repository.Repository;

/**
 * Created by Alek Ivanovski on 3/18/2018.
 */
@Profile("jpa")
public interface JpaInvestmentRepository extends InvestmentRepository, Repository<Investment, Long> {

}
