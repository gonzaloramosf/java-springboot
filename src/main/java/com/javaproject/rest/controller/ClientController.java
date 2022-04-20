package com.javaproject.rest.controller;
import com.javaproject.rest.dto.ClientDto;
import com.javaproject.rest.entity.Client;
import com.javaproject.rest.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClientController {
    @Autowired
    ClientService clientService;

    @GetMapping("/getClient/{id}")
    public Client getClient(@PathVariable(value = "id") Long id) {
        return clientService.getClient(id);
    }

    @GetMapping("/getClients")
    public List<Client> getClients() {
        return clientService.getListClients();
    }

    @GetMapping("/getClientDto/{id}")
    public ClientDto getClientDto(@PathVariable(value = "id") Long id) {
        return clientService.getClientDto(id);
    }
}
