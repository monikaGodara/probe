package com.student.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/probe")
public class ProbeController {
	
	@Autowired
	ProbeService probeService;
	
	@PostMapping("/execute")
	public Probe execute(@RequestBody CommandRequest cr) {
		
		Probe probe=new Probe(cr.getStartX(),cr.getStartY(),cr.getStartDirection());
		return probeService.executeCommands(probe, cr.getCommands());
	}

	@GetMapping("/visited")
	public List<String> getVisited(){
		return probeService.getVisited();
	}
}
