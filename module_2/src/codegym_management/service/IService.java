package codegym_management.service;

public interface IService {
    void showList(byte target);

    void addToList(byte target);

    void removeFromList(byte target);

    void Edit(byte target);
}
