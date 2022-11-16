package pt.winprovit.exercicio.api.controller;

import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.info.License;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import javax.ws.rs.core.Application;

@OpenAPIDefinition(info = @Info(title = "Projeto Agite da Altice Labs", version = "1.0.0", contact = @Contact(name = "Vinícius Pádua", email = "viniciuspadua@gmail.com")))
public class CustomApi extends Application {
}