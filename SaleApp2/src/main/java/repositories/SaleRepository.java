package repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

import models.Sale;

@Component
public interface SaleRepository extends MongoRepository<Sale, String>
{

}
