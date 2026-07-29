package com.christyjohn.bookmarker.repository;

import com.christyjohn.bookmarker.entity.Bookmark;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookmarkRepository extends JpaRepository<Bookmark, Long> {

}
