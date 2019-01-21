package ru.itpark.newweb.service;

import org.springframework.stereotype.Service;
import ru.itpark.newweb.repository.FlowersRepository;

@Service
public class FlowersService {
    FlowersRepository repository=new FlowersRepository();


}
