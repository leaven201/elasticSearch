package com.iqiyi.vip.vipes.dao;

/**
 * @author Lin ZeBin
 * @date 2019/4/2 17:25
 */

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.iqiyi.vip.vipes.bean.BookBean;

/**
 * 接口关系：
 * ElasticsearchRepository --> ElasticsearchCrudRepository --> PagingAndSortingRepository --> CrudRepository
 */
public interface BookRepository extends ElasticsearchRepository<BookBean, String> {

    //Optional<BookBean> findById(String id);

    Page<BookBean> findByAuthor(String author, Pageable pageable);

    Page<BookBean> findByTitle(String title, Pageable pageable);

}

