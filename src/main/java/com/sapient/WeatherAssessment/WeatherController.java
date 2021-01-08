package com.sapient.WeatherAssessment;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/weather")
public class WeatherController {

	@RequestMapping("/")
	public String getWeather() {
		return "High Low";
	}
}
