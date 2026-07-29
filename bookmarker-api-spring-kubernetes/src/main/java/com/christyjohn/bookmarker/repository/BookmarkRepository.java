package com.christyjohn.bookmarker.repository;

import com.christyjohn.bookmarker.dto.BookmarkDTO;
import com.christyjohn.bookmarker.entity.Bookmark;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BookmarkRepository extends JpaRepository<Bookmark, Long> {

    @Query("""
        select new com.christyjohn.bookmarker.dto.BookmarkDTO(b.id, b.title, b.url, b.createdAt) 
                from Bookmark b
        """)
    Page<BookmarkDTO> findBookMarks(Pageable pageable);
}
