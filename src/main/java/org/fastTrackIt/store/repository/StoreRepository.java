package org.fastTrackIt.store.repository;

import org.fastTrackIt.store.model.Product;
import org.fastTrackIt.store.model.StoreUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StoreRepository extends JpaRepository<StoreUser,Integer> {
    List<StoreUser> findAll();
}
