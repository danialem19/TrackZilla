package com.pluralsight.repository;

import com.pluralsight.model.Release;
import org.springframework.data.repository.CrudRepository;

public interface ReleaseRepository extends CrudRepository<Release, Long> {
}