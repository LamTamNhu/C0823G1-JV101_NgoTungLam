package repository;

import model.ChiTieu;

import java.util.List;

public interface IRepository {
    List<ChiTieu> getAll();

    List<String> getLoaiChiTieu();

    void add(ChiTieu chiTieu);
}
