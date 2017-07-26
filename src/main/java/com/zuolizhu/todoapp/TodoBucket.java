package com.zuolizhu.todoapp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Bugu on 7/25/2017.
 */
public interface TodoBucket extends JpaRepository<Todo, Long> {
    @Transactional
    void deleteByDone(boolean done);
}
