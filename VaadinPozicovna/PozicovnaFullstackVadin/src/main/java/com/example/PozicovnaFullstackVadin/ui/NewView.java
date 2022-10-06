package com.example.PozicovnaFullstackVadin.ui;



import javax.annotation.security.RolesAllowed;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;


import com.example.PozicovnaFullstackVadin.backend.Zamestnanec;
import com.example.PozicovnaFullstackVadin.backend.ZamestnanecService;
import com.vaadin.collaborationengine.CollaborationBinder;
import com.vaadin.collaborationengine.CollaborationMessageInput;
import com.vaadin.collaborationengine.CollaborationMessageList;
import com.vaadin.collaborationengine.UserInfo;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

import lombok.var;
@Route("new")
@RolesAllowed("ADMIN")
public class NewView extends VerticalLayout{

    private TextField meno = new TextField("Meno zamestnanca");
    private TextField priezvisko = new TextField("priezvisko zamestnanca");
    private DatePicker datum_narodenia = new DatePicker("Datum narodenia");
    private TextField sex = new TextField("pohlavie zamestnanca");
    private DatePicker datum_nastupenia = new DatePicker("Datum nastupenia");

    public NewView(ZamestnanecService ser) {

        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        String username =userDetails.getUsername();
        var userInfo = new UserInfo(username, username);

        
        var binder = new CollaborationBinder<>(Zamestnanec.class , userInfo);
        
        binder.bindInstanceFields(this);
        binder.setTopic("new-zamestnanec", () -> new Zamestnanec());
        var ml = new CollaborationMessageList(userInfo, "new-zamestnanec");
        
        
        
        Button saveButton = new Button("uložiť", event -> {
            var zam = new Zamestnanec();
            binder.writeBeanIfValid(zam);
            ser.add(zam);
            Notification.show("Zamestnanec bol pridany");
            binder.reset(new Zamestnanec());
        });

        VerticalLayout editForm = new VerticalLayout(
                new FormLayout(meno, priezvisko, datum_narodenia, sex, datum_nastupenia), saveButton);
        VerticalLayout chat = new VerticalLayout(ml, new CollaborationMessageInput(ml));
        HorizontalLayout horizontalLayout = new HorizontalLayout(editForm, chat);
        add(new H1("novy zamestnanec"), horizontalLayout);



        
    }


}
