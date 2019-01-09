package services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import models.Sale;
import repositories.SaleRepository;

public class SaleService
{
	@Autowired
	SaleRepository saleRepository;

	public List<Sale> getAllSales()
	{
		return saleRepository.findAll();
	}

	public void addSale(Sale sale)
	{
		saleRepository.save(sale);
	}
}
