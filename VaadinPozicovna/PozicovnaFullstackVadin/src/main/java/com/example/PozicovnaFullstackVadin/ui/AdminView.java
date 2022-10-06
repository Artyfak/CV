package com.example.PozicovnaFullstackVadin.ui;

import javax.annotation.security.RolesAllowed;

import org.vaadin.crudui.crud.impl.GridCrud;

import com.example.PozicovnaFullstackVadin.backend.Zamestnanec;
import com.example.PozicovnaFullstackVadin.backend.ZamestnanecService;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLink;

@Route("admin")
@RolesAllowed("ADMIN")
public class AdminView extends VerticalLayout{

    public AdminView(ZamestnanecService service) {
        var crud = new GridCrud<>(Zamestnanec.class, service);
        crud.getGrid().setColumns("meno", "priezvisko", "datum_narodenia","datum_nastupenia", "sex");
        crud.getCrudFormFactory().setVisibleProperties("meno", "priezvisko", "datum_narodenia","datum_nastupenia", "sex");
        crud.setAddOperationVisible(false);
        crud.getCrudLayout().addToolbarComponent(new RouterLink("Nový zamestnanec", NewView.class));

        add( new H1("ahoj admin"),
        crud
        );
        
    }
    
    
}
