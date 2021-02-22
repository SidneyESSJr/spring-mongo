package br.com.workshopmongo.worshopmongodb.dto;

import java.io.Serializable;

import br.com.workshopmongo.worshopmongodb.domain.User;

public class AuthorDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private String id;
    private String name;

    public AuthorDTO() {
    }

    public AuthorDTO(User obj) {
        this.id = obj.getId();
        this.name = obj.getName();
    }

    public User toUser() {
        User user = new User();
        user.setId(id);
        user.setName(name);
        return user;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
