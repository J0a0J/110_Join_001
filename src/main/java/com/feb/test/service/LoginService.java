package com.feb.test.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.feb.test.dao.LoginDao;
import com.feb.test.entity.Member;
import com.feb.test.util.Sha512Encoder;

@Service //  등록 하면서 안에 있는 내용 다 읽음 
public class LoginService {
	
	@Autowired //서비스 읽으면서 얘도 같이 읽고 DI 함. 
	private LoginDao loginDao;
	
	
	
//	Dao 호출할 때만 멤버아이디 
	public boolean login(HashMap<String, String> params) {
		
		String memberId = params.get("memberId");
		System.out.println("member printfnksfdnnls " + memberId);
		Member member = loginDao.login(memberId);
		
		// 객체가 하나일 때 
		// mybatis 에서는 최대한 이프문 사
		if(ObjectUtils.isEmpty(member)) return false;
		
		System.out.println("mememmememe " + member);
		String memberPw = member.getPasswd(); // db 에 있는 값 
		
		Sha512Encoder encoder = Sha512Encoder.getInstance();
		String passwd = params.get("pwd"); // 사용자가 입력한 값 
		String encodeTxt = encoder.getSecurePassword(passwd);	// 사용자가 입력한 값을 암호화 한 것. 
		
		// boolean
		return (StringUtils.pathEquals(memberPw, encodeTxt)); // db 받아온 값- memberPw, 입력 암호화 - encodeTxt
		
		
//		비밀번호를 직접적으로 비교하면 안 됨. 아이디로 비교해야 함. 
	}
}
