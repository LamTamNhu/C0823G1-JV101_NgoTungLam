package codegym_management.controller;

import codegym_management.service.IService;
import codegym_management.service.Service;

public class Controller {
    private final IService IService = new Service();

    public void showList(byte target) {
        IService.showList(target);
    }

    public void addToList(byte target) {
        IService.addToList(target);
    }

    public void removeFromList(byte target) {
        IService.removeFromList(target);
    }
}
