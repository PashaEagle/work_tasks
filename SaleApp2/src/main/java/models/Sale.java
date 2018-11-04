package models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Sale
{
	@Id
	private ObjectId Id;
	private String name;
	private String price;

	public Sale()
	{
	}

	public Sale(String name, String price)
	{
		this.name = name;
		this.price = price;
	}

	public void setId(String id)
	{
		Id = new ObjectId(id);
	}

	public String getId()
	{
		return Id.toHexString();
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

	public void setPrice(String price)
	{
		this.price = price;
	}

	public String getPrice()
	{
		return price;
	}
}
