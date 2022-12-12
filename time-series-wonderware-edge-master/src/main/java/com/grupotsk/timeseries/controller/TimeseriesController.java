package com.grupotsk.timeseries.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.grupotsk.timeseries.model.PhysicalModel;
import com.grupotsk.timeseries.model.Stops;
import com.grupotsk.timeseries.model.Values;
import com.grupotsk.timeseries.model.Atributes;
import com.grupotsk.timeseries.model.NewStop;
import com.grupotsk.timeseries.repository.AtributesRepository;
import com.grupotsk.timeseries.repository.NewStopRespository;
import com.grupotsk.timeseries.repository.PhysicalModelRepository;
import com.grupotsk.timeseries.repository.StopsRepository;
import com.grupotsk.timeseries.repository.ValuesRepository;

@RestController

@CrossOrigin(origins = "http://localhost:4200")
public class TimeseriesController {

	@Autowired
	PhysicalModelRepository phymodelRep;
	@Autowired
	AtributesRepository atriRep;
	@Autowired
	ValuesRepository valRep;
	@Autowired 
	StopsRepository stopRep;
	@Autowired 
	NewStopRespository newStopRep;

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

	@GetMapping("/stopsMachine")
	public List<Stops> stopList(@RequestParam(value = "name", defaultValue = "") String name){
		return stopRep.find(name);
	}

	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/insertStop")
	public boolean registerStop(@RequestParam(value = "tagname", defaultValue = "") String tagname,
			@RequestParam(value = "dateTime", defaultValue = "") String dateTime,
			@RequestParam(value = "codParada", defaultValue = "") String codParada,
			@RequestParam(value = "fechaProd", defaultValue = "") String fechaProd,
			@RequestParam(value = "codMaqui", defaultValue = "") String codMaqui,
			@RequestParam(value = "desMaqui", defaultValue = "") String desMaqui,
			@RequestParam(value = "codTurno", defaultValue = "") String codTurno,
			@RequestParam(value = "fechaIni", defaultValue = "") String fechaIni,
			@RequestParam(value = "fechaFin", defaultValue = "") String fechaFin,
			@RequestParam(value = "motivo", defaultValue = "") String motivo,
			@RequestParam(value = "desMotivo", defaultValue = "") String desMotivo,
			@RequestParam(value = "minutosPriParada", defaultValue = "") String minutosPriParada,
			@RequestParam(value = "motivoSegParada", defaultValue = "") String motivoSegPar){


		return newStopRep.insert2(tagname,dateTime,codParada,fechaProd,codMaqui,desMaqui,codTurno,fechaIni,fechaFin,motivo,desMotivo,minutosPriParada,motivoSegPar);
	}
	
	@GetMapping("/viewStops")
	public List<NewStop> stopsDesc(@RequestParam(value = "tagname", defaultValue = "") String name,
			@RequestParam(value = "datetime", defaultValue = "") String date){
		return newStopRep.viewStops(name,date);
	}

	
	
}
