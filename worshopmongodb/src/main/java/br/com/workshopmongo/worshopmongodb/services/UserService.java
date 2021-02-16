package br.com.workshopmongo.worshopmongodb.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.workshopmongo.worshopmongodb.domain.User;
import br.com.workshopmongo.worshopmongodb.repository.UserRepository;
import br.com.workshopmongo.worshopmongodb.services.exception.ObjectNotFoundException;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }

    public User findById(String id) {
        Optional<User> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public User insert(User user) {
        return repository.save(user);
    }

    public void delete(String id) {
        findById(id);
        repository.deleteById(id);
    }

    public User update(User user) {
        User userFromDB = findById(user.getId());
        updateData(user, userFromDB);
        return repository.save(userFromDB);
    }

    private void updateData(User user, User userFromDB) {
        userFromDB.setName(user.getName());
        userFromDB.setEmail(user.getEmail());
    }
} 
