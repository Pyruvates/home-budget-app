package ru.koshkarovvitalii.ui;

import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.RouterLink;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.applayout.DrawerToggle;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

@Route("")
@PageTitle("Home Budget")
public class MainView extends AppLayout {

    public MainView() {
        createHeader();
        createTabsPanel();
    }

    private void createHeader() {
        H1 logo = new H1("Home budget");

        HorizontalLayout header = new HorizontalLayout(new DrawerToggle(), logo);
        header.setDefaultVerticalComponentAlignment(FlexComponent.Alignment.CENTER);

        addToNavbar(header);
    }

    private void createTabsPanel() {
        RouterLink purchasesLink = new RouterLink("purchases", Purchases.class);
        RouterLink statisticsLink = new RouterLink("statistics", Statistics.class);

        addToDrawer(new VerticalLayout(purchasesLink), new VerticalLayout(statisticsLink));
    }

}
