/*package com.example.Spring.Initializr.product.repository;
import org.springframework.stereotype.Repository;
import com.example.Spring.Initializr.product.domain.Product;
import java.util.Optional;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import org.springframework.data.jpa.repository.JpaRepository;

    @Repository
    public class FirstProductRepository {

        protected final Map<Long, Product> map = new HashMap<>();
        protected long counter = 1;

        public Product save(Product entity) {
            setId(entity);
            return entity;
        }


        private Product setId(Product entity) {
            if (entity.getId() != null) { // Если ID уже есть (это обновление)
                map.put(entity.getId(), entity);
            } else { // Если ID нет (это создание нового)
                entity.setId(counter);
                map.put(counter, entity);
                counter++;
            }
            return entity;
        }
        public Optional<Product> findById(Long id) {
            return Optional.ofNullable(map.get(id));
        }
        public void delete(Long id) {
            map.remove(id);
        }
        public List<Product> findAll() {
            return new ArrayList<>(map.values());
        }


    }
*/
