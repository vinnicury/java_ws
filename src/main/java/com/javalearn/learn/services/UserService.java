package com.javalearn.learn.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.javalearn.learn.entities.User;
import com.javalearn.learn.repositories.OrderItemRepository;
import com.javalearn.learn.repositories.OrderRepository;
import com.javalearn.learn.repositories.UserRepository;

import jakarta.transaction.Transactional;


@Service
public class UserService {

    @Autowired
    private UserRepository repository;
    public List<User> findAll() {
        return repository.findAll();

    }

    @Autowired
    private OrderRepository orderRepository;
    
    @Autowired
    private OrderItemRepository orderItemRepository;

    public User findById(Long id) {
        Optional<User> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ResourceNotFoundException(id));
    }

    public User insert(User obj) {
        return repository.save(obj);
    }

    @Transactional
public void delete(Long id) {
    try {
        orderItemRepository.deleteAllItemsByClientId(id); // primeiro deleta os itens dos pedidos
        orderRepository.deleteAllByClientId(id);          // depois os pedidos
        repository.deleteById(id);                        // por fim, o usuário
    } catch (EmptyResultDataAccessException e) {
        throw new ResourceNotFoundException(id);
    } catch (RuntimeException e) {
        e.printStackTrace();
    }
}

    public User update(Long id, User obj) {
        User entity = repository.getReferenceById(id);
        updateData(entity, obj);
        return repository.save(entity);
    }

    private void updateData(User entity, User obj) {
        entity.setName(obj.getName());
        entity.setEmail(obj.getEmail());
        entity.setPhone(obj.getPhone());
        
    }
}
