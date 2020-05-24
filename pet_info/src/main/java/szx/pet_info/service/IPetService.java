package szx.pet_info.service;

import szx.pet_info.entity.Pet;

import java.util.List;

public interface IPetService {
    List<Pet> selectAllInfo();
    Pet selectByNum(String number);
    void addPet(Pet pet);
}
