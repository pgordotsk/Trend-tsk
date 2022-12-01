package com.grupotsk.timeseries.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.grupotsk.timeseries.model.PhysicalModel;

public interface PhysicalModelRepository extends JpaRepository<PhysicalModel, Long> {
	

	List<PhysicalModel> findByHierarchicalContaining(String string);
	List<PhysicalModel> findByHierarchicalStartingWith(String string);
	List<PhysicalModel> findByHierarchicalStartingWithOrderByHierarchical(String string);
	List<PhysicalModel> findByAreaid(Integer id);
	

	
}