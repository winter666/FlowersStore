package ru.itpark.newweb.repository;

import org.springframework.stereotype.Repository;
import ru.itpark.newweb.domain.Flowers;

import java.util.ArrayList;
import java.util.List;

@Repository
public class FlowersRepository {
    List<Flowers> flowers=new ArrayList<>();
}
