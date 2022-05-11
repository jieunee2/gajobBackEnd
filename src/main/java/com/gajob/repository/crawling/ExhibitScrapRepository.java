package com.gajob.repository.crawling;

import com.gajob.entity.crawling.Exhibit;
import com.gajob.entity.crawling.ExhibitScrap;
import com.gajob.entity.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ExhibitScrapRepository extends JpaRepository<ExhibitScrap, Long> {

    @Query("select e from ExhibitScrap e")
    List<ExhibitScrap> findAll();

    Optional<ExhibitScrap> findByUserAndExhibit(User user, Exhibit exhibit);

    Optional<ExhibitScrap> deleteByUserAndExhibit(User user, Exhibit exhibit);

}