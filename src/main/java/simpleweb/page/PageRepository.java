package simpleweb.page;

import org.springframework.data.repository.CrudRepository;

import simpleweb.page.Page;


public interface PageRepository extends CrudRepository<Page, Long> {
    Page findByPageKey(String pageKey);
}