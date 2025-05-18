package com.notifyservice.repository;

import com.notifyservice.entity.NotifyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotifyRepository extends JpaRepository<NotifyEntity, Long> {


}
