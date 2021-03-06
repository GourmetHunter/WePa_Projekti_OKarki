/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wad.repository;

import java.util.List;
import wad.domain.NewsObject;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author ollik
 */
public interface NewsObjectRepository extends JpaRepository<NewsObject, Long>{
    List<NewsObject> findAllByCategory(String category);
}
