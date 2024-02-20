package com.feb.test.dao;

import org.springframework.stereotype.Repository;

import com.feb.test.entity.Member;

@Repository
public interface LoginDao {

	public Member login(String memberId);
}
