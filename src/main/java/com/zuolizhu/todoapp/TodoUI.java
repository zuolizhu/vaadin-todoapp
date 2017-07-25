package com.zuolizhu.todoapp;

import com.vaadin.icons.VaadinIcons;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.*;
import com.vaadin.ui.themes.ValoTheme;
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
        root.setDefaultComponentAlignment(Alignment.MIDDLE_CENTER);
        setContent(root);
    }
    private void addHeader() {
        Label header = new Label("Add your TODOs");
        header.addStyleName(ValoTheme.LABEL_H1);
        root.addComponent(header);
    }
    private void addForm() {
        HorizontalLayout formLayout = new HorizontalLayout();
        formLayout.setWidth("80%");
        TextField task = new TextField();
        Button add = new Button("");
        add.addStyleName(ValoTheme.BUTTON_PRIMARY);
        add.setIcon(VaadinIcons.PLUS);
        formLayout.addComponentsAndExpand(task);
        formLayout.addComponents(add);
        root.addComponent(formLayout);
    }
    private void addTodoList() {
        todolayout.setWidth("80%");
        root.addComponent(todolayout);
    }
    private void addDeleteButton() {
        root.addComponent(new Button("Delete completed"));
    }
}
