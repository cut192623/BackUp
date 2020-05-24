package szx.pet_info.dao;

import szx.pet_info.entity.Pet;

import java.util.List;

public interface PetMapper {
    List<Pet> selectAllInfo();
    Pet selectByNum(String number);
    void addPet(Pet pet);
}
