package com.vishnu.Weektest.repo;

import com.vishnu.Weektest.model.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaptopRepo extends JpaRepository<Laptop,String> {
}
