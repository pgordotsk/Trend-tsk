package com.grupotsk.timeseries.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.grupotsk.timeseries.model.PhysicalModel;
import com.grupotsk.timeseries.model.Values;
import com.grupotsk.timeseries.model.Atributes;
import com.grupotsk.timeseries.repository.AtributesRepository;
import com.grupotsk.timeseries.repository.PhysicalModelRepository;
import com.grupotsk.timeseries.repository.ValuesRepository;

@RestController

@CrossOrigin(origins = "http://172.17.0.123")
public class TimeseriesController {

	@Autowired
	PhysicalModelRepository phymodelRep;
	@Autowired
	AtributesRepository atriRep;
	@Autowired
	ValuesRepository valRep;

	//@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/physicalmodel")
	public List<PhysicalModel> areasCompleto(@RequestParam(value = "id", defaultValue = "829") Integer id){
		return phymodelRep.findByAreaid(id);
	}

	//@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/atributes")
	public List<Atributes> atributesList(@RequestParam(value = "name", defaultValue = "") String name){
		return atriRep.find(name);
	}

	//@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/values")
	public List<Values> vlues(@RequestParam(value = "name", defaultValue = "") String name,
			@RequestParam(value = "dateI", defaultValue = "") String dateI,
			@RequestParam(value = "dateF", defaultValue = "") String dateF,
			@RequestParam(value = "retrieval", defaultValue = "delta") String retrieval,
			@RequestParam(value = "resolution", defaultValue = "100") Integer resolution){
		
		return valRep.find(name,dateI,dateF,retrieval,resolution); 
	}

}
