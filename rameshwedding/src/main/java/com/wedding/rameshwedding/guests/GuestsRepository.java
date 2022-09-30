package com.wedding.rameshwedding.guests;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface GuestsRepository extends JpaRepository<GuestEntity,Long> {
   Optional<List<GuestEntity>> findByWithFamily(Boolean withOrWithoutFamily);

}


