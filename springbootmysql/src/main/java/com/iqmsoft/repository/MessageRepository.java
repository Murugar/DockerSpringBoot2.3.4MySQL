package com.iqmsoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iqmsoft.model.Message;

@Repository
public interface MessageRepository extends JpaRepository<Message, Integer> {
}
