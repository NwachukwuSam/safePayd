package Data.Repositories;
import Data.Models.Comment;

import java.util.List;

public interface CommentRepository {
    Comment save(Comment comment);

    Comment findById(int id);
    List<Comment> findAll();
    void deleteByComment(Comment comment);
    void deleteById(int id);
    void deleteAll();

    long count();
}
