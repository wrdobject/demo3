package com.example.demo3.Service;

import com.example.demo3.Pojo.Flights;

import java.util.List;

public interface FlightsService {
    /**
     * 添加
     * @param flights
     * @return
     */
    int Insert(Flights flights);
    /**
     * 根据条件查询
     * @param flights
     * @return
     */
    List<Flights> selectAll(Flights flights);
    /**
     * 删除
     * @param flights
     * @return
     */
    int Delect(Flights flights);

    /**
     * 修改
     * @param flights
     * @return
     */
    int Update(Flights flights);
}
