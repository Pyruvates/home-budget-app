package ru.koshkarovvitalii.ui;

import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

@Route(value = "statistics", layout = MainView.class)
@PageTitle("Home budget | Statistics")
public class Statistics extends VerticalLayout {

    public Statistics() {
        add(new H3("In developing..."));
    }

}
