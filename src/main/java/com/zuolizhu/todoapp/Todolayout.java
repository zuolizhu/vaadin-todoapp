package com.zuolizhu.todoapp;

import com.vaadin.spring.annotation.SpringComponent;
import com.vaadin.ui.VerticalLayout;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * Created by Bugu on 7/25/2017.
 */
@SpringComponent
public class Todolayout extends VerticalLayout {
    @Autowired
    TodoBucket bucket;

    @PostConstruct
    void init() {
        setTodos(bucket.findAll());
    }

    private void setTodos(List<Todo> todos) {
        removeAllComponents();
    }
}
