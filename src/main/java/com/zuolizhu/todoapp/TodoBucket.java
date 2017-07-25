package com.zuolizhu.todoapp;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Bugu on 7/25/2017.
 */
public interface TodoBucket extends JpaRepository<Todo, Long> {

}
