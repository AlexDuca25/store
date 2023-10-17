package org.fastTrackIt.store.service;

import org.fastTrackIt.store.model.EmployeePosition;
import org.fastTrackIt.store.model.StoreUser;
import org.fastTrackIt.store.repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class StoreService {
    private StoreRepository storeRepository;

    @Autowired
    public StoreService(StoreRepository storeRepository) {
        this.storeRepository = storeRepository;
    }

    public List<StoreUser> getAllEmployees() {
        return storeRepository.findAll();
    }

    public List<StoreUser> getAllUsers(String position) {
        return storeRepository.findAll().stream()
                .filter(storeUser -> storeUser.getPosition().equals(position))
                .collect(Collectors.toList());
    }

    public StoreUser addUser(StoreUser user) {
        StoreUser newUser = new StoreUser(user.getEnployee_name(), user.getEmployee_email(), user.getEmployee_age(), user.getEmployee_password());
        storeRepository.save(newUser);
        return newUser;
    }

    public StoreUser makeAdmin(int userId) {
        StoreUser futureAdmin = null;
        Optional<StoreUser> foundUser = storeRepository.findById(userId);
        if(foundUser.isPresent()) {
            StoreUser userFromDb = foundUser.get();
            userFromDb.setPosition(EmployeePosition.EMPLOYEE);
            futureAdmin=storeRepository.save(userFromDb);
        }
        return futureAdmin;
    }

    public StoreUser demoteAdmin(int userId) {
        StoreUser demoteAdmin = null;
        Optional<StoreUser> foundUser = storeRepository.findById(userId);
        if(foundUser.isPresent()) {
            StoreUser userFromDb = foundUser.get();
            userFromDb.setPosition(EmployeePosition.CUSTOMER);
            demoteAdmin=storeRepository.save(userFromDb);
        }
        return demoteAdmin;
    }

    public String deleteUser(int userId) {
        storeRepository.deleteById(userId);
        return "The was deleted";
    }
}
