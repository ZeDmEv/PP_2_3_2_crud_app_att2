package web.Dao;

import org.springframework.stereotype.Repository;
import web.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@Repository
public class UserDaoImpl implements UserDao{
    private static  AtomicInteger AUTO_ID = new AtomicInteger(0);
    private static Map<Long, User> users = new HashMap<>();

    @Override
    public List<User> allUsers() {
        return new ArrayList<User>(users.values());
    }

    @Override
    public void add(User user) {
        user.setId(AUTO_ID.getAndIncrement());
        users.put(user.getId(), user);
    }

    @Override
    public void delete(User user) {
        users.remove(user.getId());
    }

    @Override
    public void edit(User user) {
        users.put(user.getId(),user);
    }

    @Override
    public User getById(long id) {
        return users.get(id);
    }
}
