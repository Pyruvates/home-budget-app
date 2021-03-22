package ru.koshkarovvitalii.ui;

import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

@Route(value = "purchases", layout = MainView.class)
@PageTitle("Home budget | Purchases")
public class Purchases extends VerticalLayout {

    public Purchases() {
        add(new Paragraph("In developing..."));
    }

}
