package tn.esprit.tpcafe_eyahamami.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tpcafe_eyahamami.entities.Article;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
