package com.javaproject.rest.service;

import com.javaproject.rest.dto.ClientDto;
import com.javaproject.rest.entity.Client;

import java.util.List;

public interface ClientService {
    Client getClient(Long id);

    List<Client> getListClients();

    ClientDto getClientDto(Long id);
}
