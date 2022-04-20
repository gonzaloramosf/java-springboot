package com.javaproject.rest.service;
import com.javaproject.rest.dto.ClientDto;
import com.javaproject.rest.entity.Client;
import com.javaproject.rest.repository.ClientRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;
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

    public ClientDto getClientDto(Long id) {
        Client clientToGet = clientRepository.findById(id).orElseThrow(RuntimeException::new);
        ClientDto clientDto = new ClientDto();
        clientDto.setName(clientToGet.getName());
        clientDto.setLastname(clientToGet.getLastName());
        LocalDate currentDate = LocalDate.now();
        String clientDate = clientToGet.getDate();
        clientDto.setDate(LocalDate.parse(clientDate));
        clientDto.setAge(Period.between(LocalDate.parse(clientDate), currentDate).getYears());
        return clientDto;
    }
}