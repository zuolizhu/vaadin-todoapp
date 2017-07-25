package com.zuolizhu.todoapp;

import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.*;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Bugu on 7/25/2017.
 */

@SpringUI
public class TodoUI extends UI {

    private VerticalLayout root;

    @Autowired
    Todolayout todolayout;

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        setupLayout();
        addHeader();
        addForm();
        addTodoList();
        addDeleteButton();
    }

    private void setupLayout() {
        root = new VerticalLayout();
        setContent(root);
    }
    private void addHeader() {
        root.addComponent(new Label("Add your TODOs"));
    }
    private void addForm() {
        HorizontalLayout formlayout = new HorizontalLayout();
        TextField task = new TextField();
        Button add = new Button("Add");
        formlayout.addComponents(task, add);
        root.addComponent(formlayout);
    }
    private void addTodoList() {
        root.addComponent(todolayout);
    }
    private void addDeleteButton() {
        root.addComponent(new Button("Delete completed"));
    }
}
