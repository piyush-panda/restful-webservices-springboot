package com.piyush.training.restfulwebservices.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.Date;

/**
 * Created by piyush.panda on 14/10/2018.
 */
@ApiModel(description = "Complete description for User")
public class User {

    private Integer id;

    @Size(min = 2, message = "Name should have atleast 2 charaters")
    @ApiModelProperty(notes = "Name should be atleast 2 characters")
    private String name;

    @Past
    @ApiModelProperty(notes = "Bithday should be in the past")
    private Date birthDate;

    protected User () {

    }

    public User(Integer id, String name, Date birthDate) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;

    }

    public Date getBirthDate() {
        return birthDate;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
