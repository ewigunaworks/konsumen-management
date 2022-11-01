package com.seasalt.seasalt.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.seasalt.seasalt.model.Konsumen;
import com.seasalt.seasalt.service.KonsumenService;

@Controller
public class KonsumenController {
  @Autowired
  private KonsumenService konsumenService;

  @InitBinder
  public void InitBinder(WebDataBinder binder) {
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
  }

  @RequestMapping(value = "/list-konsumen", method = RequestMethod.GET)
	public String showKonsumen(ModelMap model) {
		model.put("konsumen", konsumenService.listAll());
		return "list-konsumen";
	}

  @RequestMapping(value = "/add-konsumen", method = RequestMethod.GET)
	public String showAddKonsumenPage(ModelMap model) {
		model.addAttribute("konsumen", new Konsumen());
		return "konsumen";
	}

	@RequestMapping(value = "/delete-konsumen", method = RequestMethod.GET)
	public String deleteKonsumen(@RequestParam long id) {
		konsumenService.delete(id);
		return "redirect:/list-konsumen";
	}

	@RequestMapping(value = "/update-konsumen", method = RequestMethod.GET)
	public String showUpdateKonsumenPage(@RequestParam long id, ModelMap model) {
		Konsumen konsumen = konsumenService.get(id);
		model.put("konsumen", konsumen);
		return "konsumen";
	}

	@RequestMapping(value = "/update-konsumen", method = RequestMethod.POST)
	public String updateKonsumen(ModelMap model, @Valid Konsumen konsumen, BindingResult result) {

		if (result.hasErrors()) {
			return "konsumen";
		}

		konsumenService.save(konsumen);
		return "redirect:/list-konsumen";
	}

	@RequestMapping(value = "/add-konsumen", method = RequestMethod.POST)
	public String addKonsumen(ModelMap model, @Valid Konsumen konsumen, BindingResult result) {

		if (result.hasErrors()) {
			return "konsumen";
		}

		konsumenService.save(konsumen);
		return "redirect:/list-konsumen";
	}
}
