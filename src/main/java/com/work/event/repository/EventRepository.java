package com.work.event.repository;

import com.work.event.model.Event;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long > {
    Page<Event> findAllByEnableTrue(Pageable paginacao);
}
