package Data.Repositories;


import Data.Models.Articles;

import java.util.List;

public interface ArticleRepository {
    Articles save(Articles articles);
    Articles findById(int id);
    List<Articles> findAll();
    void deleteByArticle(Articles article);
    void deleteById(int id);
    void deleteAll();
    int Count();
}
