package Data.Repositories;

import Data.Models.Comment;

import java.util.ArrayList;
import java.util.List;

public class CommentRepositoryImpl implements CommentRepository{
    private int count;
    private List<Comment> comments =new ArrayList<>();
    @Override
    public Comment save(Comment comment) {
        boolean commentHasNotBeenSaved = comment.getId() == 0;
        if (commentHasNotBeenSaved){
            comment.setId(generateId());
            comments.add(comment);
            count++;
        }
        return comment;
    }
    private int generateId() {
        return (count+1);
    }

    @Override
    public Comment findById(int id) {
        for (Comment comment: comments){
            if (comment.getId()==id)
                return comment;
        }
        return null;
    }

    @Override
    public List<Comment> findAll() {
        for (Comment myComment: comments){
            if (myComment.getId()>0){
                return comments;
            }
        }
        return null;
    }

    @Override
    public void deleteByComment(Comment comment) {
        for (Comment commentMe: comments){
            if (commentMe.equals(comment)) {
                comments.remove(comment);
                break;
            }
        }count--;
    }
    @Override
    public void deleteById(int id) {
        for (Comment commentMe: comments){
            if (commentMe.getId()==id){
                comments.remove(commentMe);
                break;
            }
        }count--;
    }

    @Override
    public void deleteAll() {
        for (Comment myComment: comments){
            comments.remove(myComment);
            break;
        }
        count=0;
    }

    @Override
    public long count() {
        return count;
    }
}
