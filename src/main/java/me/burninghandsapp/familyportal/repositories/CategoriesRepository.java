package me.burninghandsapp.familyportal.repositories;

import me.burninghandsapp.familyportal.models.Categories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriesRepository extends JpaRepository<Categories,Integer> {

    @Query(value = "Select Top(1) * from Categories u where u.id =:Id",nativeQuery = true)
    Categories findCategoryById(@Param("Id") Integer Id);

}
