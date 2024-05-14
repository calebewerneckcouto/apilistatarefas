package br.com.react.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.react.model.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long>{
	
	
	@Query(value = "select i from Item i where i.id =?1")
	List<Item>findByid(Long id);

}
