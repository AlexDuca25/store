package org.fastTrackIt.store.controller;

import org.fastTrackIt.store.model.StoreUser;
import org.fastTrackIt.store.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("store")
public class StoreController {
    private StoreService storeService;

    @Autowired
    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }
    @GetMapping("")
    public List<StoreUser> getAllEmployees(){
        return storeService.getAllEmployees();
    }
    @GetMapping("{position}")
    public List<StoreUser> getAllUsers(@PathVariable String position){
        return storeService.getAllUsers(position);
    }
    @PostMapping
    private StoreUser addUser(@RequestBody StoreUser user){
        return storeService.addUser(user);
    }
    @PutMapping("/makeAdmin/{user_id}")
    public StoreUser makeAdmin(@PathVariable int user_id){
        return storeService.makeAdmin(user_id);
    }
    @PutMapping("/demoteAdmin/{user_id}")
    public StoreUser demoteAdmin(@PathVariable int user_id){
        return storeService.demoteAdmin(user_id);
    }
    @DeleteMapping("/deleteUser/{user_id}")
    public String deleteUser(@PathVariable int user_id){
        return storeService.deleteUser(user_id);
    }
}
