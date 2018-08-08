package com.example.demo3.Service;

import com.example.demo3.Mapper.FlightsMapper;
import com.example.demo3.Pojo.Flights;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightsServiceImpl implements FlightsService {
    @Autowired
    private FlightsMapper flightsMapper;
    @Override
    public List<Flights> selectAll(Flights flights) {
        return flightsMapper.selectAll(flights);
    }

    @Override
    public int Insert(Flights flights) {
        return flightsMapper.Insert(flights);
    }

    @Override
    public int Delect(Flights flights) {
        return  flightsMapper.Delete(flights);
    }

    @Override
    public int Update(Flights flights) {
        return flightsMapper.Update(flights);
    }
}
