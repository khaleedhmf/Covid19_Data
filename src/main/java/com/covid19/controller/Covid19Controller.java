package com.covid19.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.covid19.bean.Covid19Bean;
import com.covid19.constants.Constants;
import com.covid19.dao.Covid19Repository;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
@RestController
public class Covid19Controller {

	@Autowired
	Covid19Repository repo;

	@GetMapping
	public List<Covid19Bean> getCovid19DataSet() {
		RestTemplate restTemplate = new RestTemplate();
		String response = restTemplate.getForObject(Constants.API_URL, String.class);
		// Converting String to Array
		JSONObject jsonObject = new JSONObject(response);
		// converting array of json data into array of strings
		String stringArray = jsonObject.getJSONArray(Constants.RAW_DATA).toString();
		return repo.saveAll(getListOfBean(stringArray));

	}

	// getting array from json response

	public List<Covid19Bean> getListOfBean(String array) {

		List<Covid19Bean> listBean = new ArrayList<>();
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
			listBean = objectMapper.readValue(array, new TypeReference<List<Covid19Bean>>() {
			});

		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listBean;
	}

}
