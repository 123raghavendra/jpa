package com.xworkz.krawards.Repository;

import org.hibernate.event.spi.SaveOrUpdateEvent;

import com.xworkz.krawards.entity.KRAwardsEntity;

public interface KRAwardsRepo {
	
	 boolean Save(KRAwardsEntity awardsDTO);

}
