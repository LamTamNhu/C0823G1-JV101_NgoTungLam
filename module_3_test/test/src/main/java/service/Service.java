package service;

import model.ChiTieu;
import repository.IRepository;
import repository.Repository;

import java.util.List;

public class Service implements IService{
    IRepository repository = new Repository();
    @Override
    public List<ChiTieu> getAll() {
        return repository.getAll();
    }

    @Override
    public List<String> getLoaiChiTieu() {
        return repository.getLoaiChiTieu();
    }

    @Override
    public void add(ChiTieu chiTieu) {
        repository.add(chiTieu);
    }
}
