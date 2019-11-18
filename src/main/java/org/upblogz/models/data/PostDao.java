package org.upblogz.models.data;


        import org.springframework.data.repository.CrudRepository;
        import org.springframework.stereotype.Repository;
        import org.upblogz.models.Post;
        import javax.transaction.Transactional;

@Repository
@Transactional
public interface PostDao extends CrudRepository<Post, Integer> {
}
