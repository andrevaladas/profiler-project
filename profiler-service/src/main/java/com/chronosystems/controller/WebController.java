package com.chronosystems.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chronosystems.entity.util.Option;
import com.chronosystems.entity.util.TypeaheadOption;
import com.chronosystems.entity.util.TypeaheadValue;

@Controller
@RequestMapping
public class WebController {

	@RequestMapping("/page/{page}")
	public String page(@PathVariable("page") final String page, final ModelMap model) {
		return page;
	}
	
	@RequestMapping(value = "/ajax", method = RequestMethod.GET)
	public @ResponseBody TypeaheadValue ajax(@RequestParam("query") final String query, final ModelMap model) {
		final TypeaheadValue values = new TypeaheadValue();
		values.addOption("Valadas");
		values.addOption("André");
		values.addOption("Teste");
		return values;
	}

	@RequestMapping(value = "/ajax2", method = RequestMethod.GET)
	public @ResponseBody TypeaheadOption ajax2(@RequestParam("query") final String query, final ModelMap model) {
		final Option data1 = new Option(Long.valueOf(1), "André Valadas");
		final Option data2 = new Option(Long.valueOf(2), "André Valadas 2");
		final Option data3 = new Option(Long.valueOf(3), "André Valadas 3");
		final Option data4 = new Option(Long.valueOf(4), "André Valadas 4");
		final Option data5 = new Option(Long.valueOf(5), "André Valadas 5");
		final Option data6 = new Option(Long.valueOf(6), "André Valadas 6");
		final Option data7 = new Option(Long.valueOf(7), "André Valadas 7");
		final Option data8 = new Option(Long.valueOf(8), "André Valadas 8");
		final Option data9 = new Option(Long.valueOf(9), "André Valadas 9");
		final Option data10 = new Option(Long.valueOf(10), "André Valadas 10");

		final TypeaheadOption result = new TypeaheadOption();
		result.add(data1);
		result.add(data2);
		result.add(data3);
		result.add(data4);
		result.add(data5);
		result.add(data6);
		result.add(data7);
		result.add(data8);
		result.add(data9);
		result.add(data10);
		return result;
	}
}