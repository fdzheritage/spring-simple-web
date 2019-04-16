package springsimpleweb;

import org.springframework.data.repository.CrudRepository;

import springsimpleweb.Page;

public interface PageRepository extends CrudRepository<Page, Integer> {
    // @Query("SELECT * FROM page where pageKey = ? ")   Without magic
    Page findByPageKey(String pageKey); // Magic
}