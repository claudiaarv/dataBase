package com.project.db.repository;

import com.project.db.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MsgRepository extends JpaRepository<Message, Integer>{
}
