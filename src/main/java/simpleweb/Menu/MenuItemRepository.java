package simpleweb.menu;

import org.springframework.data.repository.CrudRepository;

import simpleweb.menu.MenuItem;


public interface MenuItemRepository extends CrudRepository<MenuItem, Integer> {
    // Page findByPageKey(String pageKey);
}