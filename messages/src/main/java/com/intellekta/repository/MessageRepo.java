/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intellekta.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.intellekta.model.Message;
import java.util.List;

/**
 *
 * @author alekseynesterov
 */

@Repository
public interface MessageRepo extends CrudRepository<Message, Integer> {

    List<Message> findByName(String name);
}
