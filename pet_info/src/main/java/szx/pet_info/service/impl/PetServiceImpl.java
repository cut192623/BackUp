package szx.pet_info.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import szx.pet_info.dao.PetMapper;
import szx.pet_info.entity.Pet;
import szx.pet_info.service.IPetService;


import java.util.List;

@Service
public class PetServiceImpl implements IPetService {
    @Autowired(required = false)
    private PetMapper petMapper;
    @Override
    public List<Pet> selectAllInfo() {

        return  petMapper.selectAllInfo();
    }

    @Override
    public Pet selectByNum(String number) {
        return petMapper.selectByNum(number);
    }

    @Override
    public void addPet(Pet pet) {
        petMapper.addPet(pet);
    }
}
