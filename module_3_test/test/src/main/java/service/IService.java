package service;

import model.ChiTieu;

import java.util.List;

public interface IService {
    List<ChiTieu> getAll();

    List<String> getLoaiChiTieu();

    void add(ChiTieu chiTieu);
}
