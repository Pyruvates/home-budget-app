package ru.koshkarovvitalii;

import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;

/**
 * The main view contains a button and a click listener.
 */
@Route("")
@PWA(name = "Home budget application", shortName = "Home budget")
@CssImport("./styles/shared-styles.css")
@CssImport(value = "./styles/vaadin-text-field-styles.css", themeFor = "vaadin-text-field")
public class MainView extends VerticalLayout {

    public MainView() {
        setAlignItems(Alignment.CENTER);

        Text text = new Text("Home budget");

        TextField nameField = new TextField("Enter your name");

        Button greet = new Button("Greet");
        greet.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        greet.addClickShortcut(Key.ENTER);
        greet.addClickListener(clickEvent -> {
            Notification n = new Notification();
            n.setDuration(2000);
            n.setPosition(Notification.Position.MIDDLE);

            if (nameField.getValue() != null && !nameField.getValue().isEmpty()) {
                n.setText("Hello, " + nameField.getValue() + "!");
            } else {
                n.setText("Hello, anonymous user!");
            }
            n.open();
        });

        add(text, nameField, greet);
    }
}
