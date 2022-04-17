package com.javaproject.rest.service;
import com.javaproject.rest.entity.Client;
import com.javaproject.rest.repository.ClientRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ClientServiceImpl implements ClientService {
    @Autowired
    ClientRepository clientRepository;

    public Client getClient(Long id) {
        Client clientToGet = clientRepository.findById(id).orElseThrow(RuntimeException::new);
        return clientToGet;
    }

    public List<Client> getListClients() {
        return clientRepository.findAll();
    }
}
