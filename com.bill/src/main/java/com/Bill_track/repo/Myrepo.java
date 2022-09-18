package com.Bill_track.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Bill_track.entities.Bills;

@Repository
public interface Myrepo extends JpaRepository<Bills, Integer> {

}
