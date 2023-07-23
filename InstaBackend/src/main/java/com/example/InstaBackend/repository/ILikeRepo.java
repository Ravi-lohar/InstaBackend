package com.example.InstaBackend.repository;

import com.example.InstaBackend.model.Like;
import com.example.InstaBackend.model.Post;
import com.example.InstaBackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ILikeRepo extends JpaRepository<Like,Integer> {

    List<Like> findByInstaPostAndLiker(Post instaPost, User liker);

    List<Like> findByInstaPost(Post validPost);
}