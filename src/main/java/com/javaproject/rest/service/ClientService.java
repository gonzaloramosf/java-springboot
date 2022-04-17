package com.javaproject.rest.service;

import com.javaproject.rest.entity.Client;

import java.util.List;

public interface ClientService {
    public Client getClient(Long id);

    List<Client> getListClients();
}
