package controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import models.Sale;
import services.SaleService;

@RestController
@RequestMapping("/sale")
public class SaleController
{
	@Autowired
	SaleService saleService;

	@RequestMapping(value = "/get", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE)
	public List<Sale> getAllSales()
	{
		return saleService.getAllSales();
	}

	@RequestMapping(value = "/create", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void addSale(@RequestBody Sale sale)
	{
		saleService.addSale(sale);
	}
}
