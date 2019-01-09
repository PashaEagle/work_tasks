package repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import org.springframework.stereotype.Component;

import models.Sale;

@Component
public interface SaleRepos extends MongoRepository<Sale, String>
{

}
